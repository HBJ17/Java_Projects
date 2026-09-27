/*
 * Predicted Output:
 * A
 * C
 * D
 *
 * Explanation:
 * - "A" is printed first.
 * - int x = 10 / 0 throws ArithmeticException immediately, so control
 *   jumps straight to the catch block -- "B" is NEVER printed because
 *   the exception interrupts execution right at that line.
 * - The catch(ArithmeticException) block runs and prints "C".
 * - After the try-catch finishes, "D" is printed.
 * - The array line (a[5]) is never reached at all because the ArithmeticException
 *   already transferred control out of the try block before that point.
 *
 * To also handle the array exception, add another catch block for
 * ArrayIndexOutOfBoundsException, as shown below (used if 10/0 line is
 * removed or guarded).
 */
public class Q4_PredictOutputFlow {
    public static void main(String[] args) {
        try {
            System.out.println("A");
            int x = 10 / 0;
            System.out.println("B");
            int[] a = {1, 2, 3};
            System.out.println(a[5]);
        }
        catch (ArithmeticException e) {
            System.out.println("C");
        }
        catch (ArrayIndexOutOfBoundsException e) { // added to also handle array exception
            System.out.println("Array exception occurred");
        }
        System.out.println("D");
    }
}
