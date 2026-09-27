/*
 * Error: 15.75 is a double literal and cannot be implicitly narrowed and
 * assigned to an int variable without an explicit cast -> compilation error
 * "incompatible types: possible lossy conversion from double to int".
 * Fix: either change the variable type to double, or explicitly cast (which
 * would truncate the decimal part). Here we use double since the value
 * 15.75 needs to be preserved.
 */
public class TypeDebug1 {
    public static void main(String[] args) {
        double value = 15.75;
        System.out.println(value);
    }
}
