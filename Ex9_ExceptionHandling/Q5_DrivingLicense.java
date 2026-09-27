import java.util.Scanner;

class UnderAgeException extends Exception {
    public UnderAgeException(String message) {
        super(message);
    }
}

public class Q5_DrivingLicense {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            checkEligibility(age);
            System.out.println("You are eligible to apply for a driving license.");
        } catch (UnderAgeException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }

    static void checkEligibility(int age) throws UnderAgeException {
        if (age < 16) {
            throw new UnderAgeException("You must be at least 16 years old to apply for a driving license.");
        }
    }
}
