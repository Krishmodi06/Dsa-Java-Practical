import java.util.ArrayList;
import java.util.Scanner;

class Ticket {
    int ticketId;
    String passengerName;
    String trainName;
    String source;
    String destination;

    Ticket(int ticketId, String passengerName, String trainName, String source, String destination) {
        this.ticketId = ticketId;
        this.passengerName = passengerName;
        this.trainName = trainName;
        this.source = source;
        this.destination = destination;
    }

    public void displayTicket() {
        System.out.println("Ticket ID: " + ticketId);
        System.out.println("Passenger: " + passengerName);
        System.out.println("Train: " + trainName);
        System.out.println("From: " + source);
        System.out.println("To: " + destination);
        System.out.println("------------------------");
    }
}

public class project5 {
    ArrayList<Ticket> bookedTickets = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    int ticketCounter = 1;

    public void bookTicket() {
        System.out.print("Enter Passenger Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Train Name: ");
        String train = sc.nextLine();
        System.out.print("Enter Source Station: ");
        String source = sc.nextLine();
        System.out.print("Enter Destination Station: ");
        String destination = sc.nextLine();

        Ticket ticket = new Ticket(ticketCounter++, name, train, source, destination);
        bookedTickets.add(ticket);
        System.out.println("Ticket booked successfully! Ticket ID: " + ticket.ticketId);
    }

    public void showTickets() {
        if (bookedTickets.isEmpty()) {
            System.out.println("No tickets booked yet.");
            return;
        }
        System.out.println("\n--- Booked Tickets ---");
        for (Ticket t : bookedTickets) {
            t.displayTicket();
        }
    }

    public void cancelTicket() {
        if (bookedTickets.isEmpty()) {
            System.out.println("No tickets to cancel.");
            return;
        }
        System.out.print("Enter Ticket ID to cancel: ");
        int id = sc.nextInt();
        sc.nextLine();
        boolean found = false;

        for (int i = 0; i < bookedTickets.size(); i++) {
            if (bookedTickets.get(i).ticketId == id) {
                bookedTickets.remove(i);
                System.out.println("Ticket cancelled successfully!");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Ticket ID not found!");
        }
    }

    public static void main(String[] args) {
        project5 railway = new project5();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Railway Ticket Booking System ---");
            System.out.println("1. Book Ticket");
            System.out.println("2. Show Tickets");
            System.out.println("3. Cancel Ticket");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> railway.bookTicket();
                case 2 -> railway.showTickets();
                case 3 -> railway.cancelTicket();
                case 4 -> System.out.println("Exiting... Thank you!");
                default -> System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 4);
    }
}
