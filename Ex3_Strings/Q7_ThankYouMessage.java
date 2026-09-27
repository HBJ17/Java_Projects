public class Q7_ThankYouMessage {
    public static void main(String[] args) {
        String customerName = "Hubert";
        String productName = "Laptop";

        // Method 1: simple + concatenation
        String concatMessage = "Thank you " + customerName + " for purchasing " + productName + " from OurStore";
        System.out.println(concatMessage);

        // Method 2: using StringBuffer
        StringBuffer sb = new StringBuffer();
        sb.append("Thank you ").append(customerName)
          .append(" for purchasing ").append(productName)
          .append(" from OurStore");
        System.out.println(sb.toString());
    }
}
