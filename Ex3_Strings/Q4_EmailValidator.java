public class Q4_EmailValidator {
    public static void main(String[] args) {
        String[] allowedDomains = {"@company.com", "@staff.company.com"};
        String inputEmail = "  John.Doe@Staff.Company.COM  ";

        String cleaned = inputEmail.trim().toLowerCase();

        boolean isValid = false;
        for (String domain : allowedDomains) {
            if (cleaned.endsWith(domain)) {
                isValid = true;
                break;
            }
        }

        System.out.println("Cleaned email: " + cleaned);
        System.out.println("Valid company email: " + isValid);
    }
}
