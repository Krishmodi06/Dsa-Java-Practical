import java.util.ArrayList;
import java.util.Scanner;

class Account {
    int accNo;
    String name;
    double balance;

    Account(int accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }

    public String toString() {
        return "AccNo: " + accNo + " | Name: " + name + " | Balance: ₹" + balance;
    }
}

public class project3 {
    static ArrayList<Account> accounts = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static int nextAccNo = 1001;

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n===== ATM / Account Simulation =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Display All Accounts");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> createAccount();
                case 2 -> deposit();
                case 3 -> withdraw();
                case 4 -> checkBalance();
                case 5 -> displayAll();
                case 6 -> System.out.println("Exiting... Thank you!");
                default -> System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 6);

        sc.close();
    }

    static void createAccount() {
        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();
        System.out.print("Enter initial deposit amount: ");
        double amt = sc.nextDouble();
        sc.nextLine();
        if (amt < 0) amt = 0;
        Account acc = new Account(nextAccNo++, name, amt);
        accounts.add(acc);
        System.out.println("Account created successfully! Your Account Number: " + acc.accNo);
    }

    static Account findAccount(int accNo) {
        for (Account a : accounts) {
            if (a.accNo == accNo) return a;
        }
        return null;
    }

    static void deposit() {
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        System.out.print("Enter amount to deposit: ");
        double amt = sc.nextDouble();
        sc.nextLine();
        Account a = findAccount(accNo);
        if (a == null) {
            System.out.println("Account not found!");
            return;
        }
        if (amt <= 0) {
            System.out.println("Invalid amount!");
            return;
        }
        a.balance += amt;
        System.out.println("Deposit successful. New balance: ₹" + a.balance);
    }

    static void withdraw() {
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        System.out.print("Enter amount to withdraw: ");
        double amt = sc.nextDouble();
        sc.nextLine();
        Account a = findAccount(accNo);
        if (a == null) {
            System.out.println("Account not found!");
            return;
        }
        if (amt <= 0) {
            System.out.println("Invalid amount!");
            return;
        }
        if (amt > a.balance) {
            System.out.println("Insufficient balance!");
            return;
        }
        a.balance -= amt;
        System.out.println("Withdrawal successful. New balance: ₹" + a.balance);
    }

    static void checkBalance() {
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        sc.nextLine();
        Account a = findAccount(accNo);
        if (a == null) {
            System.out.println("Account not found!");
            return;
        }
        System.out.println("Account Holder: " + a.name);
        System.out.println("Current Balance: ₹" + a.balance);
    }

    static void displayAll() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts found.");
            return;
        }
        System.out.println("\n--- All Accounts ---");
        for (Account a : accounts) {
            System.out.println(a);
        }
    }
}
