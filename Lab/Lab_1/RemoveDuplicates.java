import java.util.LinkedHashSet;
 
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 3, 5, 9, 8, 1};
        LinkedHashSet<Integer> uniqueSet = new LinkedHashSet<>();
 
        for (int num : arr) {
            uniqueSet.add(num);
        }
 
        System.out.print("Array without duplicates: ");
        for (int num : uniqueSet) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}