/*
 * Error: scanner.nextInt() reads only the integer token and leaves the
 * trailing newline character in the input buffer. The very next
 * scanner.nextLine() call then reads that leftover empty line instead of
 * waiting for the user's name, so the name input is skipped.
 * Fix: consume the leftover newline with an extra scanner.nextLine() call
 * right after nextInt(), before reading the name.
 */
import java.util.Scanner;

public class InputDebug {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // consume leftover newline

        System.out.print("Enter your full name: ");
        String name = scanner.nextLine();

        System.out.println(name + " is " + age + " years old.");
        scanner.close();
    }
}
