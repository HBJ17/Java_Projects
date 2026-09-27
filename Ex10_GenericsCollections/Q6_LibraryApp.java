import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class Q6_LibraryApp {
    public static void main(String[] args) {
        TreeSet<String> categories = new TreeSet<>();
        categories.add("Fiction");
        categories.add("Science");

        HashMap<String, HashMap<String, ArrayList<String>>> library = new HashMap<>();

        // Fiction category
        HashMap<String, ArrayList<String>> fictionTopics = new HashMap<>();
        ArrayList<String> fantasyBooks = new ArrayList<>();
        fantasyBooks.add("The Hobbit");
        fantasyBooks.add("Harry Potter");
        fictionTopics.put("Fantasy", fantasyBooks);

        ArrayList<String> mysteryBooks = new ArrayList<>();
        mysteryBooks.add("Sherlock Holmes");
        mysteryBooks.add("Murder on the Orient Express");
        fictionTopics.put("Mystery", mysteryBooks);

        library.put("Fiction", fictionTopics);

        // Science category
        HashMap<String, ArrayList<String>> scienceTopics = new HashMap<>();
        ArrayList<String> dsBooks = new ArrayList<>();
        dsBooks.add("Introduction to Algorithms");
        dsBooks.add("Data Structures in Java");
        scienceTopics.put("Data Structures", dsBooks);

        ArrayList<String> javaBooks = new ArrayList<>();
        javaBooks.add("Effective Java");
        javaBooks.add("Head First Java");
        scienceTopics.put("Java", javaBooks);

        library.put("Science", scienceTopics);

        // Display all categories in sorted order
        for (String category : categories) {
            System.out.println("Category: " + category);
            HashMap<String, ArrayList<String>> topics = library.get(category);
            for (String topic : topics.keySet()) {
                System.out.println("  Topic: " + topic);
                for (String book : topics.get(topic)) {
                    System.out.println("    - " + book);
                }
            }
        }
    }
}
