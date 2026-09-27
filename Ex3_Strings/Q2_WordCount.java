public class Q2_WordCount {
    public static void main(String[] args) {
        String text = "This is a simple text editor test";

        // Method 1: manual character-by-character counting
        int manualCount = 0;
        boolean inWord = false;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c != ' ' && !inWord) {
                inWord = true;
                manualCount++;
            } else if (c == ' ') {
                inWord = false;
            }
        }
        System.out.println("Word count (manual): " + manualCount);

        // Method 2: using split()
        String[] words = text.trim().split("\\s+");
        System.out.println("Word count (split): " + words.length);
    }
}
