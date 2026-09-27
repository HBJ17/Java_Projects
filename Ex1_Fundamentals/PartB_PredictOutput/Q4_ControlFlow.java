/*
 * Output:
 * 1 2
 * 1 3
 * 2 1
 * 2 3
 * 3 1
 * 3 2
 *
 * Explanation: whenever i == j, 'continue' skips the println for that
 * iteration and moves to the next value of j, so the pairs where i equals j
 * (1 1, 2 2, 3 3) are never printed.
 */
public class ControlFlow {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == j) {
                    continue;
                }
                System.out.println(i + " " + j);
            }
        }
    }
}
