/*
 * Output:
 * [1, 99, 3, 4]
 *
 * Explanation: arrays are reference types. 'alias' does not create a copy
 * of 'original' -- it copies the reference, so both variables point to the
 * SAME array object in memory. Modifying alias[1] also changes
 * original[1].
 */
import java.util.Arrays;

public class ArrayReference {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] alias = original;

        alias[1] = 99;

        System.out.println(Arrays.toString(original));
    }
}
