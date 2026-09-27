import java.util.ArrayList;

public class Q3_ToDoApp {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();

        // a. Add tasks
        tasks.add("Buy groceries");
        tasks.add("Finish homework");
        tasks.add("Clean the house");
        tasks.add("Pay bills");
        tasks.add("Call the dentist");

        // b. Display tasks with indices
        System.out.println("Tasks:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(i + ": " + tasks.get(i));
        }

        // c. Update task
        int updateIndex = tasks.indexOf("Finish homework");
        if (updateIndex != -1) {
            tasks.set(updateIndex, "Submit homework");
        }
        System.out.println("\nAfter update: " + tasks);

        // d. Search task
        boolean exists = tasks.contains("Pay bills");
        System.out.println("\n'Pay bills' exists: " + exists);

        // e. Remove task
        tasks.remove("Clean the house");
        System.out.println("\nAfter removal: " + tasks);

        // f. Count tasks
        System.out.println("\nTotal tasks: " + tasks.size());

        // g. Clear tasks
        tasks.clear();
        System.out.println("\nAfter clearing, list is empty: " + tasks.isEmpty());
    }
}
