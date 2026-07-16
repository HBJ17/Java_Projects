public class BQ2 {
    public static void main(String[] args) {
        int x = 5;
        int y = ++x * 2;
        int z = y-- + x++;
 
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("z: " + z);
    }
}