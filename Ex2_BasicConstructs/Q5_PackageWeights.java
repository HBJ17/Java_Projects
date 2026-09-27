public class Q5_PackageWeights {
    public static void main(String[] args) {
        double[] weights = {8.5, 12.3, 9.9, 15.0, 10.1, 7.2, 20.5};
        int count = 0;

        for (double w : weights) {
            if (w > 10) {
                count++;
            }
        }

        System.out.println("Number of packages weighing more than 10 kg: " + count);
    }
}
