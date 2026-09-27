import java.util.Scanner;

public class Q8_PascalsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            int value = 1;
            // leading spaces for a pyramid shape
            for (int s = 0; s < rows - i - 1; s++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", value);
                value = value * (i - j) / (j + 1);
            }
            System.out.println();
        }
        sc.close();
    }
}
