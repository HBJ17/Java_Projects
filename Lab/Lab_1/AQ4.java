public class AQ4 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            System.out.println("Number: " + i);
            i++; // update statement added
            if (i > 5) {
                break;
            }
        }
    }
}