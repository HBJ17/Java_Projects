import java.util.Scanner;

public class WelcomeParticipants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of participants: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] participants = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter participant " + (i + 1) + " name: ");
            participants[i] = sc.nextLine();
        }

        String message = "Welcome: ";
        for (int i = 0; i < participants.length; i++) {
            message += participants[i];
            if (i != participants.length - 1) {
                message += ", ";
            }
        }
        System.out.println("\nUsing String Concatenation:");
        System.out.println(message);

        StringBuffer sb = new StringBuffer("Welcome: ");
        for (int i = 0; i < participants.length; i++) {
            sb.append(participants[i]);
            if (i != participants.length - 1) {
                sb.append(", ");
            }
        }
        System.out.println("\nUsing StringBuffer:");
        System.out.println(sb);
        sc.close();
    }
}