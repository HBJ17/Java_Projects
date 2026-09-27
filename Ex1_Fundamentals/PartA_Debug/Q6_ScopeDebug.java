/*
 * Error: Inside update(), a NEW local variable 'count' is declared,
 * shadowing the static field 'count'. Incrementing the local variable
 * has no effect on the static field, so main() still prints 10.
 * Fix: remove the local declaration and use the static field directly.
 */
public class ScopeDebug {
    static int count = 10;

    public static void update() {
        count += 5; // fixed: operate on the static field, not a new local var
    }

    public static void main(String[] args) {
        update();
        System.out.println("Count = " + count); // prints 15
    }
}
