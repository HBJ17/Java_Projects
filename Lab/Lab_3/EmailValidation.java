import java.util.Scanner;

public class EmailValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter email address: ");
        String email = sc.nextLine();
        email = email.trim().toLowerCase();
        String domain1 = "@company.com";
        String domain2 = "@staff.company.com";
        if (email.endsWith(domain1) || email.endsWith(domain2)) {
            System.out.println("Valid company email address.");
        } else {
            System.out.println("Invalid company email address.");
        }
        sc.close();
    }
}