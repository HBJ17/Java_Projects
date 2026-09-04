import java.io.File;
import java.util.Scanner;

class Product {
    protected String category;

    public Product(String category) {
        this.category = category;
    }
}

class CartItem extends Product {
    private String orderID;
    private String buyerName;
    private double[] prices;

    public CartItem(String category, String orderID, String buyerName, double[] prices) {
        super(category);
        this.orderID = orderID;
        this.buyerName = buyerName;
        this.prices = prices;
    }

    public double calculateGrossAmount() {
        double total = 0;
        for (double p : prices) total += p;
        return total;
    }

    public boolean isVIP() {
        return buyerName.contains("VIP");
    }

    public void displayDetails() {
        double gross = calculateGrossAmount();
        boolean vip = isVIP();
        double discount = vip ? gross * 0.15 : 0.0;
        double finalAmount = gross - discount;

        System.out.println("     E-Commerce Order ");
        System.out.println("Order ID    : " + orderID);
        System.out.println("Buyer       : " + buyerName);
        System.out.println("Category    : " + category);
        System.out.print("Item Prices : ");
        for (double p : prices) System.out.print(p + " ");
        System.out.println();
        System.out.printf("Gross Amount   : ₹%.2f%n", gross);
        System.out.println("VIP Buyer?     : " + (vip ? "Yes" : "No"));
        System.out.printf("Discount       : ₹%.2f%n", discount);
        System.out.printf("Final Payable  : ₹%.2f%n", finalAmount);
    }
}

public class E_Commerce {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new File("Lab\\Skill_Assess\\Files\\Ecommerce.txt"))) {
            String category = sc.nextLine().trim();
            String orderID = sc.nextLine().trim();
            String buyerName = sc.nextLine().trim();
            String[] priceTokens = sc.nextLine().trim().split("\\s+");

            double[] prices = new double[5];
            for (int i = 0; i < 5; i++) {
                prices[i] = Double.parseDouble(priceTokens[i]);
            }

            CartItem cart = new CartItem(category, orderID, buyerName, prices);
            cart.displayDetails();

        } catch (Exception e) {
            System.out.println("Error reading cart file: " + e.getMessage());
        }
    }
}