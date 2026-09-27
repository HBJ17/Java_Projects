/*
 * 1. Actual exception that occurs: NullPointerException, because
 *    Integer.parseInt(null) throws NullPointerException when the
 *    passed string reference is null, not NumberFormatException.
 * 2. Does the existing catch block handle it? NO -- it only catches
 *    NumberFormatException, so a NullPointerException would propagate
 *    uncaught and crash the program.
 * 3. Fix: add a catch block for NullPointerException as well.
 * 4. Difference: a null value means the String reference itself does not
 *    point to any object -- calling any method on it (even indirectly,
 *    as parseInt does internally) throws NullPointerException. A
 *    non-numeric string like "hello" IS a valid, non-null String object,
 *    but its content cannot be parsed as a number, so parseInt throws
 *    NumberFormatException instead.
 */
public class Q7_DebugExceptionHandling {
    public static void main(String[] args) {
        try {
            String value = null;
            int number = Integer.parseInt(value);
            System.out.println(number);
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid number");
        }
        catch (NullPointerException e) { // fixed: added missing catch block
            System.out.println("Value is null, cannot parse.");
        }
        System.out.println("Program completed");
    }
}
