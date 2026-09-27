public class Q2_CentsBreakdown {
    public static void main(String[] args) {
        int totalCents = 3826;
        int dollars = totalCents / 100;
        int cents = totalCents % 100;
        System.out.println(totalCents + " cents = " + dollars + " dollars and " + cents + " cents");
    }
}
