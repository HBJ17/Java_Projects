public class Q4_ArraysDemo {
    public static void main(String[] args) {
        // Approach 1: declare then assign values
        int[] arr1 = new int[5];
        arr1[0] = 10; arr1[1] = 20; arr1[2] = 30; arr1[3] = 40; arr1[4] = 50;

        // Approach 2: array literal initialization
        int[] arr2 = {11, 22, 33, 44, 55};

        System.out.println("arr1 using for loop:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        System.out.println("arr2 using enhanced for loop:");
        for (int val : arr2) {
            System.out.print(val + " ");
        }
        System.out.println();

        // 2D array
        int[][] grid = {
            {1, 2},
            {3, 4},
            {5, 6}
        };

        System.out.println("2D array elements:");
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("arr1.length = " + arr1.length);
        System.out.println("grid.length (rows) = " + grid.length);
        System.out.println("grid[0].length (cols) = " + grid[0].length);

        // valid and invalid index demonstration
        System.out.println("Valid access arr1[2]: " + arr1[2]);
        try {
            System.out.println(arr1[10]); // invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid access arr1[10] caused: " + e);
        }
    }
}
