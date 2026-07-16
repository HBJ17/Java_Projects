import java.util.Scanner;
public class AQ3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // consumes the leftover newline character
 
        System.out.print("Enter your full name: ");
        String name = scanner.nextLine();
 
        System.out.println(name + " is " + age + " years old.");
        scanner.close();
    }
}