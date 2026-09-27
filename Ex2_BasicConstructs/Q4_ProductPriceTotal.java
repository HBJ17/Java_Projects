import java.util.Scanner;

public class Q4_ProductPriceTotal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        double price;

        do {
            System.out.print("Enter product price (0 to finish): ");
            price = sc.nextDouble();
            total += price;
        } while (price != 0);

        // subtract the final 0 entry (added harmlessly since it's 0)
        System.out.println("Total amount: " + total);
        sc.close();
    }
}
