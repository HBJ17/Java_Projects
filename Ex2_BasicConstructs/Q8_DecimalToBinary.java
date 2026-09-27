import java.util.Scanner;

public class Q8_DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("Binary: 0");
            sc.close();
            return;
        }

        StringBuilder binary = new StringBuilder();
        int n = num;
        while (n > 0) {
            int remainder = n % 2;
            binary.insert(0, remainder); // build in correct order
            n = n / 2;
        }

        System.out.println("Binary representation of " + num + " is: " + binary);
        sc.close();
    }
}
