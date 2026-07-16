public class AQ11 {
    static int empId = 100;
    public static void update() {
        empId = 250; // updates the static field directly
    }
    public static void main(String[] args) {
        update();
        System.out.println(empId);
    }
}