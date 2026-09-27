import java.io.ByteArrayInputStream;

public class Q1_ChatCensor {
    public static void main(String[] args) throws Exception {
        String message = "This is a stupid and dumb message from a user";
        String[] restrictedWords = {"stupid", "dumb"};

        byte[] byteData = message.getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(byteData);

        byte[] buffer = new byte[byteData.length];
        bais.read(buffer);
        String readMessage = new String(buffer);

        for (String word : restrictedWords) {
            readMessage = readMessage.replaceAll("(?i)" + word, "***");
        }

        System.out.println("Original: " + message);
        System.out.println("Sanitized: " + readMessage);
        bais.close();
    }
}
