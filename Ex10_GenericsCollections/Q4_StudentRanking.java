import java.util.TreeSet;

public class Q4_StudentRanking {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();

        // a. Insert scores
        scores.add(85);
        scores.add(92);
        scores.add(70);
        scores.add(60);
        scores.add(90);

        // b. Display all scores (auto-sorted ascending)
        System.out.println("Scores in ascending order: " + scores);

        // c. Lowest and highest scores
        System.out.println("Lowest score: " + scores.first());
        System.out.println("Highest score: " + scores.last());

        // d. Remove one score
        scores.remove(70);
        System.out.println("After removing 70: " + scores);
    }
}
