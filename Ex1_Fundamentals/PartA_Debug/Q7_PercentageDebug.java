/*
 * Error: totalMarks / maximumMarks performs integer division
 * (423 / 500 = 0), so multiplying by 100 gives 0.0 regardless of the
 * true percentage.
 * Fix: convert one operand to double before dividing.
 */
public class PercentageDebug {
    public static void main(String[] args) {
        int totalMarks = 423;
        int maximumMarks = 500;
        double percentage = ((double) totalMarks / maximumMarks) * 100;
        System.out.println("Percentage = " + percentage); // 84.6
    }
}
