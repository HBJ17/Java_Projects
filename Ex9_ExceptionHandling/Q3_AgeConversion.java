import java.util.Scanner;

public class Q3_AgeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student age: ");
        String input = sc.nextLine();

        try {
            int age = Integer.parseInt(input);
            System.out.println("Age entered: " + age);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: '" + input + "' is not a valid number.");
        }

        sc.close();
    }
}
