interface ATM {
    void deposit(double amount);
    void withdraw(double amount);
    double checkBalance();
}

public class ATMSimulation implements ATM {

    private double balance;

    public ATMSimulation(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient funds for withdrawal.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }   
    @Override
    public double checkBalance() {
        return balance;
    }

    public static void main(String[] args) {
        ATMSimulation atm = new ATMSimulation(1000.0);
        atm.deposit(200.0);
        atm.withdraw(150.0);
        System.out.println("Current Balance: " + atm.checkBalance());
        atm.withdraw(1200.0);   
    }


    
}
