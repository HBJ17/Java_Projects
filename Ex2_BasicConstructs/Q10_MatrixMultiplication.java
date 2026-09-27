import java.util.Scanner;

public class Q10_MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns of first matrix: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] mat1 = new int[r1][c1];
        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c1; j++)
                mat1[i][j] = sc.nextInt();

        System.out.print("Enter columns of second matrix (rows = " + c1 + "): ");
        int c2 = sc.nextInt();
        int r2 = c1;
        int[][] mat2 = new int[r2][c2];
        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < r2; i++)
            for (int j = 0; j < c2; j++)
                mat2[i][j] = sc.nextInt();

        int[][] product = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                int sum = 0;
                for (int k = 0; k < c1; k++) {
                    sum += mat1[i][k] * mat2[k][j];
                }
                product[i][j] = sum;
            }
        }

        System.out.println("Product matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.printf("%6d", product[i][j]);
            }
            System.out.println();
        }
        sc.close();
    }
}
