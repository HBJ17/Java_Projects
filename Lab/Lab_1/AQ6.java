public class AQ6 {
    static int count = 10;
    public static void update() {
        count += 5; // updates the static field directly
    }
    public static void main(String[] args) {
        update();
        System.out.println("Count = " + count);
    }
}