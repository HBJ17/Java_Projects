import java.util.Scanner;
public class BQ3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
 
        System.out.print("Result: ");
        System.out.println(a + b);
        System.out.printf("Values: %d and %d\n", a, b);
        input.close();
    }
}