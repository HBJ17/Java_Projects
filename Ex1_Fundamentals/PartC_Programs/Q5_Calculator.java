import java.util.Scanner;

public class Q5_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add  2. Subtract  3. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            if (choice == 1 || choice == 2) {
                System.out.print("Enter first number: ");
                double a = sc.nextDouble();
                System.out.print("Enter second number: ");
                double b = sc.nextDouble();

                switch (choice) {
                    case 1:
                        System.out.println("Result: " + (a + b));
                        break;
                    case 2:
                        System.out.println("Result: " + (a - b));
                        break;
                }
            } else if (choice != 3) {
                System.out.println("Invalid option.");
            }
        } while (choice != 3);

        System.out.println("Exiting calculator.");
        sc.close();
    }
}
