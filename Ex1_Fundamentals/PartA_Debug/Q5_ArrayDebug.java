/*
 * Error: scores[4] is accessed but the array has only 4 elements
 * (valid indices 0-3). This throws ArrayIndexOutOfBoundsException at runtime.
 * Fix: use scores[3] (array.length - 1) to get the last element.
 */
public class ArrayDebug {
    public static void main(String[] args) {
        int[] scores = new int[4];
        scores[0] = 89;
        scores[1] = 94;
        scores[2] = 78;
        scores[3] = 90;

        System.out.println("The last score is: " + scores[scores.length - 1]);
    }
}
