public class Q11_WaterUsage {
    public static void main(String[] args) {
        double[] litres = {150, 200, 180, 220, 160, 300, 190}; // sample week data
        double total = 0;

        for (double l : litres) {
            total += l;
        }
        double average = total / litres.length;

        double maxUsage = litres[0];
        int maxDay = 0;
        for (int i = 1; i < litres.length; i++) {
            if (litres[i] > maxUsage) {
                maxUsage = litres[i];
                maxDay = i;
            }
        }

        System.out.println("Total usage: " + total + " litres");
        System.out.println("Average usage: " + average + " litres");
        System.out.println("Day with maximum consumption: Day " + (maxDay + 1) + " (" + maxUsage + " litres)");

        StringBuilder binaryStatus = new StringBuilder();
        int day = 1;
        for (double l : litres) {
            System.out.println("Day " + day + ": " + l + " litres - " +
                    (l > average ? "Above average" : "Below average"));
            binaryStatus.append(l > average ? "1" : "0");
            day++;
        }
        System.out.println("High/Low usage binary string: " + binaryStatus);
    }
}
