import java.util.Scanner;

public class FeedbackAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter customer feedback: ");
        String feedback = sc.nextLine();
        feedback = feedback.trim().toLowerCase();
        String bad = "bad";
        String poor = "poor";
        String good = "good";
        String excellent = "excellent";
        System.out.println("Position of 'bad': " + feedback.indexOf(bad));
        System.out.println("Position of 'poor': " + feedback.indexOf(poor));
        System.out.println("Position of 'good': " + feedback.indexOf(good));
        System.out.println("Position of 'excellent': " + feedback.indexOf(excellent));
        feedback = feedback.replace("bad", "****");
        feedback = feedback.replace("poor", "****");
        System.out.println("Modified Feedback: " + feedback);
        sc.close();
    }
}