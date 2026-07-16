import java.util.Scanner;
 
public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
 
        do {
            System.out.println("\n1. Add\n2. Subtract\n3. Exit");
            System.out.print("Choose an operation: ");
            choice = sc.nextInt();
 
            if (choice == 1 || choice == 2) {
                System.out.print("Enter first number: ");
                double num1 = sc.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = sc.nextDouble();
 
                switch (choice) {
                    case 1:
                        System.out.println("Result: " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("Result: " + (num1 - num2));
                        break;
                }
            } else if (choice == 3) {
                System.out.println("Exiting calculator...");
            } else {
                System.out.println("Invalid choice!");
            }
        } while (choice != 3);
 
        sc.close();
    }
}