import java.util.Scanner;

public class Q6_ArrayStats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] values = new int[5];

        System.out.println("Enter 5 integer values:");
        for (int i = 0; i < values.length; i++) {
            values[i] = sc.nextInt();
        }

        int max = values[0];
        int min = values[0];
        int sum = 0;

        for (int v : values) {
            if (v > max) max = v;
            if (v < min) min = v;
            sum += v;
        }

        double average = sum / (double) values.length;

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Average: " + average);

        sc.close();
    }
}
