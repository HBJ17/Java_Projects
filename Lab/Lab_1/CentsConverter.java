public class CentsConverter {
    public static void main(String[] args) {
        int totalCents = 3826;
        int dollars = totalCents / 100;
        int remainingCents = totalCents % 100;
 
        System.out.println(totalCents + " cents = " + dollars +
            " dollars and " + remainingCents + " cents");
    }
}