import java.util.Scanner;

public class VehicleRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter vehicle registration number: ");
        String regNo = sc.nextLine();
        regNo = regNo.trim().toUpperCase();

        String code1 = "TN";
        String code2 = "KA";
        String code3 = "DL";

        if (regNo.startsWith(code1) || regNo.startsWith(code2) || regNo.startsWith(code3)) {
            System.out.println("Valid vehicle registration number.");
        } else {
            System.out.println("Invalid vehicle registration number.");
        }
        sc.close();
    }
}