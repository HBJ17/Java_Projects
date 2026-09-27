/*
 * Errors found:
 * 1. int population = 8000000000; -> value exceeds int range (max ~2.1 billion).
 *    Fix: use long and append L suffix.
 * 2. float price = 19.99; -> 19.99 is a double literal by default, cannot be
 *    assigned to float without a cast or 'f' suffix.
 *    Fix: float price = 19.99f;
 * 3. greeting is used before it is declared (variable used before declaration).
 *    Fix: declare and initialize 'greeting' before using it in println.
 */
public class DataTypeDebug {
    public static void main(String[] args) {
        long population = 8000000000L;
        float price = 19.99f;
        String greeting = "Hello World!";
        System.out.println(greeting);
        System.out.println("Population: " + population);
        System.out.println("Price: " + price);
    }
}
