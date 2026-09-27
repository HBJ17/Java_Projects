import java.util.Arrays;

public class Q10_RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {4, 8, 4, 1, 8, 9, 1, 2};
        int[] unique = new int[arr.length];
        int count = 0;

        for (int num : arr) {
            boolean found = false;
            for (int i = 0; i < count; i++) {
                if (unique[i] == num) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                unique[count++] = num;
            }
        }

        int[] result = Arrays.copyOf(unique, count);
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Array without duplicates: " + Arrays.toString(result));
    }
}
