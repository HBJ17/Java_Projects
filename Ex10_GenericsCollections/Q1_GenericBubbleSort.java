import java.util.Arrays;

public class Q1_GenericBubbleSort {

    static <T extends Comparable<T>> void bubbleSort(T[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer[] rollNumbers = {105, 101, 108, 102, 107};
        String[] names = {"Ravi", "Anu", "Zara", "Kiran", "Divya"};
        Double[] grades = {8.5, 9.2, 7.8, 9.9, 6.4};

        System.out.println("Before sorting:");
        System.out.println("Roll Numbers: " + Arrays.toString(rollNumbers));
        System.out.println("Names: " + Arrays.toString(names));
        System.out.println("Grades: " + Arrays.toString(grades));

        bubbleSort(rollNumbers);
        bubbleSort(names);
        bubbleSort(grades);

        System.out.println("\nAfter sorting:");
        System.out.println("Roll Numbers: " + Arrays.toString(rollNumbers));
        System.out.println("Names: " + Arrays.toString(names));
        System.out.println("Grades: " + Arrays.toString(grades));
    }
}
