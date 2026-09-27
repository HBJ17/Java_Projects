import java.io.*;
import java.util.Scanner;

class UnderAgeException2 extends Exception {
    public UnderAgeException2(String message) { super(message); }
}

public class Q6_MovieTicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BufferedReader reader = null;

        try {
            // a. Age check
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            if (age < 18) {
                throw new UnderAgeException2("Booking denied: must be 18 or older.");
            }

            // b. Read ticket data from file
            try {
                reader = new BufferedReader(new FileReader("tickets.txt"));
                String line = reader.readLine();
                System.out.println("Ticket data: " + (line != null ? line : "No data found"));
            } catch (IOException e) {
                System.out.println("Ticket file not found, proceeding with default seating.");
            }

            // c. Seat selection
            System.out.print("Enter seat number: ");
            int seat = sc.nextInt();
            int seatCheck = 100 / seat; // throws ArithmeticException if seat == 0
            System.out.println("Seat " + seat + " selected successfully.");

            // d. Payment (try-catch-finally to ensure resources closed)
            try {
                System.out.print("Enter payment amount: ");
                double amount = sc.nextDouble();
                System.out.println("Payment of " + amount + " processed.");
            } finally {
                System.out.println("Closing payment gateway resources.");
            }

        } catch (UnderAgeException2 e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error: Invalid seat number (cannot be zero).");
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        } finally {
            try {
                if (reader != null) reader.close();
            } catch (IOException e) {
                System.out.println("Error closing file reader.");
            }
            System.out.println("Booking session ended.");
        }

        sc.close();
    }
}
