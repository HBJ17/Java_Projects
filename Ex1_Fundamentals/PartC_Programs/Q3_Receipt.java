import java.util.Scanner;

public class Q3_Receipt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter item name: ");
        String item = sc.nextLine();
        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();
        System.out.print("Enter unit price: ");
        double price = sc.nextDouble();

        double total = qty * price;

        System.out.println("\n-------- RECEIPT --------");
        System.out.printf("%-15s %5s %10s%n", "Item", "Qty", "Price");
        System.out.printf("%-15s %5d %10.2f%n", item, qty, price);
        System.out.println("-------------------------");
        System.out.printf("Total: %.2f%n", total);

        sc.close();
    }
}
