import java.util.Scanner;

public class ChatMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the message: ");
        String input = sc.nextLine();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < input.length(); i++) {
            sb.append(input.charAt(i));
        }
        String message = sb.toString().trim();
        System.out.println("Final Message: " + message);
        sc.close();
    }
}