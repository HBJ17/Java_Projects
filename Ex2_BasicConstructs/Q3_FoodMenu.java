import java.util.Scanner;

public class Q3_FoodMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Burger  - Rs.80");
        System.out.println("2. Pizza   - Rs.120");
        System.out.println("3. Sandwich- Rs.50");
        System.out.println("4. Coffee  - Rs.40");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Price: Rs.80");
                break;
            case 2:
                System.out.println("Price: Rs.120");
                break;
            case 3:
                System.out.println("Price: Rs.50");
                break;
            case 4:
                System.out.println("Price: Rs.40");
                break;
            default:
                System.out.println("Invalid menu option");
        }
        sc.close();
    }
}
