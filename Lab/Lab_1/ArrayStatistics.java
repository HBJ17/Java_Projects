import java.util.Scanner;
 
public class ArrayStatistics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] values = new int[5];
 
        System.out.println("Enter 5 integer values:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Value " + (i + 1) + ": ");
            values[i] = sc.nextInt();
        }
 
        int max = values[0], min = values[0], sum = 0;
        for (int v : values) {
            if (v > max) max = v;
            if (v < min) min = v;
            sum += v;
        }
        double average = sum / 5.0;
 
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Average: " + average);
 
        sc.close();
    }
}