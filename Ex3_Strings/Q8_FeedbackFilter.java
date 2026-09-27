public class Q8_FeedbackFilter {
    public static void main(String[] args) {
        String[] keywords = {"bad", "poor", "good", "excellent"};
        String feedback = "  The service was really BAD and the staff was Poor.  ";

        String cleaned = feedback.trim().toLowerCase();
        String censored = cleaned;

        for (String keyword : keywords) {
            int index = censored.indexOf(keyword);
            while (index != -1) {
                System.out.println("Keyword \"" + keyword + "\" found at position: " + index);
                censored = censored.substring(0, index) + "****" + censored.substring(index + keyword.length());
                index = censored.indexOf(keyword, index + 4);
            }
        }

        System.out.println("Original (cleaned): " + cleaned);
        System.out.println("Censored feedback : " + censored);
    }
}
