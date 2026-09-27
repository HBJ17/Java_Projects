public class Q1_ReverseString {
    public static void main(String[] args) {
        String message = "Hello Chat";

        // Method 1: using charAt() and a loop
        String reversedManual = "";
        for (int i = message.length() - 1; i >= 0; i--) {
            reversedManual += message.charAt(i);
        }
        System.out.println("Reversed (manual): " + reversedManual);

        // Method 2: using StringBuffer.reverse()
        StringBuffer sb = new StringBuffer(message);
        System.out.println("Reversed (StringBuffer): " + sb.reverse().toString());
    }
}
