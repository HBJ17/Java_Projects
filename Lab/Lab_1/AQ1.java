import java.util.Scanner;

public class AQ1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Length of Rectangle: ");
        int length = input.nextInt();
        
        System.out.println("Enter Length of Rectangle: ");
        int breadth = input.nextInt();

        System.out.printf("The Perimeter of the Rectangle is: %d", 2*(length+breadth));
        System.out.printf("The Area of the Rectangle is: %d", length*breadth);
        input.close();
    }
}