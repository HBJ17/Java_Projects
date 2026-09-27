/*
 * Version A - catching with NullPointerException specifically:
 * Output:
 * Exception handled
 * End of program
 *
 * Version B - catching with general Exception class:
 * Output:
 * Exception handled
 * End of program
 *
 * Explanation: Both versions produce the same output because
 * NullPointerException IS-A Exception (it is a subclass of
 * RuntimeException, which is a subclass of Exception). The exception
 * hierarchy allows a catch block for a more general type to catch any
 * more specific exception thrown within the try block, as long as no
 * more specific catch block intercepts it first.
 */
public class Q2_SpecificVsGeneral {
    public static void main(String[] args) {
        System.out.println("--- Version A: catch (NullPointerException) ---");
        versionA();
        System.out.println("--- Version B: catch (Exception) ---");
        versionB();
    }

    static void versionA() {
        try {
            String s = null;
            System.out.println(s.length());
        }
        catch (NullPointerException e) {
            System.out.println("Exception handled");
        }
        System.out.println("End of program");
    }

    static void versionB() {
        try {
            String s = null;
            System.out.println(s.length());
        }
        catch (Exception e) {
            System.out.println("Exception handled");
        }
        System.out.println("End of program");
    }
}
