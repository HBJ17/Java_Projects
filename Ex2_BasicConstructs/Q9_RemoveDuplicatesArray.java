import java.util.Scanner;

public class Q9_RemoveDuplicatesArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] unique = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int j = 0; j < count; j++) {
                if (unique[j] == arr[i]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                unique[count++] = arr[i];
            }
        }

        System.out.print("Array without duplicates: ");
        for (int i = 0; i < count; i++) {
            System.out.print(unique[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}
