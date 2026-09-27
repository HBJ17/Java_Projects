/*
 * Error: 'marks' is declared but never initialized before being used in
 * "marks + bonus" -> compilation error "variable marks might not have
 * been initialized".
 * Fix: assign an initial value to marks before using it.
 */
public class TypeDebug4 {
    public static void main(String[] args) {
        int marks = 0; // fixed: initialized
        int bonus = 5;
        System.out.println(marks + bonus);
    }
}
