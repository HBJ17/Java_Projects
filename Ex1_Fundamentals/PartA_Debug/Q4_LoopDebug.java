/*
 * Error: 'i' is never incremented inside the loop, so the condition
 * (i <= 5) never becomes false. The loop only escapes via the manual
 * break when i == 5, but since i never changes, it stays 1 forever and
 * "Number: 1" is printed infinitely.
 * Fix: increment i inside the loop (i++).
 */
public class LoopDebug {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            System.out.println("Number: " + i);
            i++; // fixed: added update statement
            if (i > 5) {
                break;
            }
        }
    }
}
