/*
 * Each catch block is required because each guards against a DIFFERENT
 * failure mode with a distinct position in the exception hierarchy:
 * - NumberFormatException  (extends IllegalArgumentException extends RuntimeException)
 *   -> occurs when Integer.parseInt() receives non-numeric text.
 * - ArrayIndexOutOfBoundsException (extends IndexOutOfBoundsException extends RuntimeException)
 *   -> occurs when accessing marks[] with an invalid index.
 * - ArithmeticException (extends RuntimeException)
 *   -> occurs when dividing the total by zero subjects.
 * Using only a single catch(Exception e) would hide which specific
 * problem occurred, making debugging and giving precise user feedback
 * harder.
 */
import java.util.Scanner;

public class Q5_RobustStudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];

        System.out.print("Enter number of subjects entered: ");
        int n;
        try {
            n = Integer.parseInt(sc.next());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number entered for subject count.");
            n = 0;
        }

        int total = 0;
        for (int i = 0; i < n; i++) {
            try {
                System.out.print("Enter mark " + (i + 1) + ": ");
                marks[i] = Integer.parseInt(sc.next());
                total += marks[i];
            } catch (NumberFormatException e) {
                System.out.println("Invalid mark entered, skipping.");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Too many marks entered for array size.");
            }
        }

        try {
            double average = total / (double) n;
            if (n == 0) throw new ArithmeticException("No subjects entered");
            System.out.println("Average marks: " + average);
        } catch (ArithmeticException e) {
            System.out.println("Cannot calculate average: " + e.getMessage());
        }

        sc.close();
    }
}
