/*
 * Output:
 * Truncated: 55
 * Letter: B
 *
 * Explanation:
 * - (int) exactValue truncates (does not round) the decimal part of
 *   55.75, giving 55.
 * - char letter = 66 stores the character whose ASCII/Unicode code
 *   point is 66, which is 'B'.
 */
public class TypeCasting {
    public static void main(String[] args) {
        double exactValue = 55.75;
        int truncatedValue = (int) exactValue;
        char letter = 66;

        System.out.println("Truncated: " + truncatedValue);
        System.out.println("Letter: " + letter);
    }
}
