/*
 * Exceptions used:
 * - ArrayIndexOutOfBoundsException  -> invalid array index access
 * - NumberFormatException           -> converting a non-numeric string
 * - ArithmeticException             -> divide by zero
 *
 * Catch block order: most specific exceptions should generally come
 * first when there is any inheritance relation, but since these three
 * are unrelated siblings under RuntimeException, order among them
 * doesn't strictly matter -- what matters is that each is listed before
 * a general catch(Exception) if one is added.
 *
 * When the first exception occurs (invalid array index), execution
 * jumps immediately to its matching catch block and the remaining
 * statements in the try block (string conversion, division) are
 * skipped entirely.
 */
public class Q3_MultipleExceptions {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);       // ArrayIndexOutOfBoundsException

            String s = "abc";
            int num = Integer.parseInt(s);     // NumberFormatException

            int result = 10 / 0;               // ArithmeticException
            System.out.println(result);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error: " + e.getMessage());
        }
        catch (NumberFormatException e) {
            System.out.println("Number format error: " + e.getMessage());
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e.getMessage());
        }
    }
}
