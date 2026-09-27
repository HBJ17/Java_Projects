/*
 * Separate catch blocks are used because the two failure modes are
 * conceptually distinct and benefit from distinct messages:
 * - NumberFormatException: user typed a non-numeric index (e.g. "abc").
 * - ArrayIndexOutOfBoundsException: user typed a syntactically valid
 *   integer, but it falls outside the valid array bounds.
 * A single catch(Exception e) would still stop the crash, but it would
 * lose the ability to tell the user WHICH kind of mistake they made,
 * making the program less helpful and harder to debug/maintain.
 */
import java.util.Scanner;

public class Q9_StudentExamResult {
    public static void main(String[] args) {
        int[] marks = {85, 72, 91, 68, 77};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student index (0-4): ");
        String indexInput = sc.next();

        try {
            int index = Integer.parseInt(indexInput);
            System.out.println("Mark: " + marks[index]);
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid input: index must be a number.");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index: must be between 0 and " + (marks.length - 1));
        }

        System.out.println("Program continues normally.");
        sc.close();
    }
}
