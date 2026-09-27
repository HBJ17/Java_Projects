/*
 * Error: inner loop condition is j <= numbers.length, so when
 * i = numbers.length - 1... eventually j reaches numbers.length itself,
 * which is an invalid index -> ArrayIndexOutOfBoundsException.
 * Fix: change condition to j < numbers.length.
 */
public class PairDebug {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) { // fixed: < not <=
                System.out.println(numbers[i] + " " + numbers[j]);
            }
        }
    }
}
