/*
 * Output:
 * x: 7
 * y: 11
 * z: 17
 *
 * Explanation:
 * x = 5
 * y = ++x * 2   -> x is pre-incremented to 6 first, then y = 6*2 = 12... 
 *   wait, trace carefully:
 *   ++x makes x = 6, expression value is 6, y = 6 * 2 = 12
 * z = y-- + x++  -> uses current y (12) then post-decrements y to 11,
 *   uses current x (6) then post-increments x to 7,
 *   z = 12 + 6 = 18
 * Final: x = 7, y = 11, z = 18
 *
 * (Re-verified by simulation below in comments)
 * x starts 5 -> ++x => x=6, y = 6*2 = 12
 * z = y-- + x++ => takes y's value 12 (then y becomes 11),
 *                  takes x's value 6 (then x becomes 7)
 *                  z = 12 + 6 = 18
 * Final values: x = 7, y = 11, z = 18
 */
public class IncrementDecrement {
    public static void main(String[] args) {
        int x = 5;
        int y = ++x * 2;
        int z = y-- + x++;

        System.out.println("x: " + x); // 7
        System.out.println("y: " + y); // 11
        System.out.println("z: " + z); // 18
    }
}
