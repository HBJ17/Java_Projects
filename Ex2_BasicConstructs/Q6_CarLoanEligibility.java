import java.util.Scanner;

public class Q6_CarLoanEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Enter annual income: ");
        double income = sc.nextInt();

        boolean ageOk = age >= 21;
        boolean incomeOk = income >= 250000;

        String result = (!ageOk && !incomeOk) ? "Not eligible: Age and income too low"
                       : (!ageOk) ? "Not eligible: Age too low"
                       : (!incomeOk) ? "Not eligible: Income too low"
                       : "Eligible for car loan";

        System.out.println(result);
        sc.close();
    }
}
