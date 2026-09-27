import java.util.Scanner;

public class Q9_CharByCharMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type your message character by character.");
        System.out.println("Enter one character at a time, type '#' to finish:");

        StringBuffer buffer = new StringBuffer();
        char ch;
        while (true) {
            String token = sc.next();
            ch = token.charAt(0);
            if (ch == '#') break;
            buffer.append(ch);
        }

        String finalMessage = buffer.toString().trim();
        System.out.println("Final message: " + finalMessage);
        sc.close();
    }
}
