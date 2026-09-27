import java.util.Scanner;

public class Q2_BillSharing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total bill amount: ");
        double totalBill = sc.nextDouble();
        System.out.print("Enter number of people sharing: ");
        int people = sc.nextInt();

        try {
            double share = totalBill / people;
            if (people == 0) {
                throw new ArithmeticException("Number of people cannot be zero");
            }
            System.out.println("Each person's share: " + share);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
