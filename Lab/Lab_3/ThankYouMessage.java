import java.util.Scanner;

public class ThankYouMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter customer name: ");
        String customerName = sc.nextLine();
        System.out.print("Enter product name: ");
        String productName = sc.nextLine();
        String msg1 = "Thank you";
        String msg2 = "for purchasing";
        String msg3 = "from OurStore";
        String message = msg1 + " " + customerName + " " + msg2 + " " + productName + " " + msg3 + ".";
        System.out.println("Using + Concatenation:");
        System.out.println(message);
        StringBuffer sb = new StringBuffer();
        sb.append(msg1)
          .append(" ")
          .append(customerName)
          .append(" ")
          .append(msg2)
          .append(" ")
          .append(productName)
          .append(" ")
          .append(msg3)
          .append(".");
        System.out.println("\nUsing StringBuffer:");
        System.out.println(sb);
        sc.close();
    }
}