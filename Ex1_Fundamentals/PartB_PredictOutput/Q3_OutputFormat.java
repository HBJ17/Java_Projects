/*
 * Assuming inputs 10 and 20:
 * Output:
 * Result: 30
 * Values: 10 and 20
 *
 * Explanation:
 * - System.out.print("Result: ") prints without a newline.
 * - System.out.println(a + b) prints 30 immediately after "Result: " on the
 *   same line, then moves to a new line.
 * - printf formats the values using %d placeholders, followed by \n.
 */
import java.util.Scanner;

public class OutputFormat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.print("Result: ");
        System.out.println(a + b);
        System.out.printf("Values: %d and %d\n", a, b);
        input.close();
    }
}
