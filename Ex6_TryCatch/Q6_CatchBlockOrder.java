/*
 * 1. Will the program compile? NO. It fails to compile.
 * 2. Problem with the order: the general catch(Exception e) block comes
 *    BEFORE the specific catch(ArithmeticException e) block. Since
 *    ArithmeticException IS-A Exception, the general block would
 *    catch everything first, making the specific block unreachable --
 *    Java's compiler flags this as an error ("exception
 *    ArithmeticException has already been caught").
 * 3. Fix: place the more specific exception type BEFORE the more
 *    general one.
 * 4. A specific exception must be listed first because catch blocks are
 *    checked top-to-bottom, and once a matching (even if more general)
 *    type is found, that block runs -- placing the general type first
 *    would make the specific block permanently unreachable, which Java
 *    disallows at compile time.
 */
public class Q6_CatchBlockOrder {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println(result);
        }
        catch (ArithmeticException e) {   // fixed: specific exception first
            System.out.println("Arithmetic Exception");
        }
        catch (Exception e) {              // general exception last
            System.out.println("General Exception");
        }
    }
}
