import java.io.CharArrayReader;

public class Q2_TextCleaner {
    public static void main(String[] args) throws Exception {
        String pastedText = "This   text has##extra   spaces and $$symbols!!";
        char[] charData = pastedText.toCharArray();

        CharArrayReader reader = new CharArrayReader(charData);
        StringBuilder cleaned = new StringBuilder();

        int c;
        while ((c = reader.read()) != -1) {
            char ch = (char) c;
            if (Character.isLetterOrDigit(ch) || ch == ' ') {
                cleaned.append(ch);
            }
        }

        // collapse multiple spaces into one
        String result = cleaned.toString().replaceAll("\\s+", " ").trim();

        System.out.println("Original: " + pastedText);
        System.out.println("Cleaned : " + result);
        reader.close();
    }
}
