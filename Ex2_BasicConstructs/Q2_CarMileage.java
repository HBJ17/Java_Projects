import java.util.Scanner;

public class Q2_CarMileage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance travelled (km): ");
        double distance = sc.nextDouble();
        System.out.print("Enter petrol used (litres): ");
        double litres = sc.nextDouble();

        double mileage = distance / litres;
        System.out.println("Mileage: " + mileage + " km/l");

        if (mileage > 15) {
            System.out.println("Fuel Efficient");
        } else {
            System.out.println("Not Fuel Efficient");
        }
        sc.close();
    }
}
