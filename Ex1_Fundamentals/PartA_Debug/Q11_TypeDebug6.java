/*
 * Logical error: update() declares a NEW local variable 'empId' (=250)
 * instead of modifying the static field 'empId'. The local variable is
 * discarded when the method returns, so the static field is still 100
 * when printed in main().
 * Fix: assign to the static field directly instead of declaring a local
 * variable with the same name.
 */
public class TypeDebug6 {
    static int empId = 100;

    public static void update() {
        empId = 250; // fixed: assign to the static field, no local redeclare
    }

    public static void main(String[] args) {
        update();
        System.out.println(empId); // prints 250
    }
}
