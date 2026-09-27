/*
 * 1. Actual exception: accessing a[5] on a 3-element array throws
 *    ArrayIndexOutOfBoundsException, NOT ArithmeticException.
 * 2. Why the existing catch block cannot handle it: the catch block only
 *    catches ArithmeticException, and ArrayIndexOutOfBoundsException is
 *    not a subtype of ArithmeticException (both are separate subclasses
 *    of RuntimeException), so it is not caught and the program crashes.
 * 3. Corrected program below.
 * 4. Predicted output:
 *    Array index error: Index 5 out of bounds for length 3
 *    Program Completed
 */
public class Q1_ArrayExceptionFix {
    public static void main(String[] args) {
        try {
            int[] a = {10, 20, 30};
            System.out.println(a[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) { // fixed exception type
            System.out.println("Array index error: " + e.getMessage());
        }
        System.out.println("Program Completed");
    }
}
