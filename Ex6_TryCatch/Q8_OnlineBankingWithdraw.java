/*
 * - Invalid numeric input (non-numeric amount string) is best handled by
 *   NumberFormatException, since it specifically signals a parsing
 *   failure from Integer.parseInt().
 * - An invalid arithmetic operation, like the account having insufficient
 *   balance leading to a negative result being treated as an error, is
 *   modeled here with a custom check using ArithmeticException, since it
 *   represents an illegal numeric/arithmetic condition (going below zero
 *   balance).
 * Using these specific exception types (rather than a single generic
 * catch) lets the program react appropriately and keep running instead of
 * terminating abnormally.
 */
import java.util.Scanner;

public class Q8_OnlineBankingWithdraw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 5000;
        boolean continueRunning = true;

        while (continueRunning) {
            System.out.print("Enter withdrawal amount (or 'exit' to quit): ");
            String input = sc.next();

            if (input.equalsIgnoreCase("exit")) {
                continueRunning = false;
                continue;
            }

            try {
                int amount = Integer.parseInt(input);
                if (amount > balance) {
                    throw new ArithmeticException("Insufficient balance");
                }
                balance -= amount;
                System.out.println("Withdrawal successful. Remaining balance: " + balance);
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid input: please enter a valid number.");
            }
            catch (ArithmeticException e) {
                System.out.println("Transaction failed: " + e.getMessage());
            }
        }

        System.out.println("Session ended. Final balance: " + balance);
        sc.close();
    }
}
