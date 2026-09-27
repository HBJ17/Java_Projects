public class Q6_VehicleRegistration {
    public static void main(String[] args) {
        String[] allowedStateCodes = {"TN", "KA", "DL"};
        String input = new String("  tn09aa1234  ");

        String cleaned = input.trim().toUpperCase();

        boolean isValid = false;
        for (String code : allowedStateCodes) {
            if (cleaned.startsWith(code)) {
                isValid = true;
                break;
            }
        }

        System.out.println("Cleaned registration number: " + cleaned);
        System.out.println("Valid registration prefix: " + isValid);
    }
}
