import java.util.Arrays;
public class BQ5 {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] alias = original;
 
        alias[1] = 99;
 
        System.out.println(Arrays.toString(original));
    }
}