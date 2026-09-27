/*
 * Error: (score1 + score2) / 2 performs INTEGER division because both
 * score1 and score2 are int, so (95+90)/2 = 185/2 = 92 (integer), which then
 * prints as 92.0 when widened to double. The fractional part .5 is lost
 * during integer division, before the result is ever converted to double.
 * Fix: cast one operand to double (or the whole expression) BEFORE dividing.
 */
public class OperatorDebug {
    public static void main(String[] args) {
        int score1 = 95;
        int score2 = 90;
        double average = (score1 + score2) / 2.0; // 2.0 forces double division
        System.out.println("Average: " + average); // prints 92.5
    }
}
