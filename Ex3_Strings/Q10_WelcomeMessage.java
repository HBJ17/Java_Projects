public class Q10_WelcomeMessage {
    public static void main(String[] args) {
        String[] participants = {"Alice", "Bob", "Charlie"};

        // Method 1: simple concatenation
        String concatMessage = "Welcome: ";
        for (int i = 0; i < participants.length; i++) {
            concatMessage += participants[i];
            if (i != participants.length - 1) {
                concatMessage += ", ";
            }
        }
        System.out.println(concatMessage);

        // Method 2: using StringBuffer
        StringBuffer sb = new StringBuffer("Welcome: ");
        for (int i = 0; i < participants.length; i++) {
            sb.append(participants[i]);
            if (i != participants.length - 1) {
                sb.append(", ");
            }
        }
        System.out.println(sb.toString());
    }
}
