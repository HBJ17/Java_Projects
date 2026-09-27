import java.util.HashMap;

public class Q5_EmployeeDirectory {
    public static void main(String[] args) {
        HashMap<Integer, String> directory = new HashMap<>();

        // a. Insert employees
        directory.put(101, "Alice");
        directory.put(102, "Bob");
        directory.put(103, "Charlie");
        directory.put(104, "David");
        directory.put(105, "Eva");

        // b. Display all entries
        System.out.println("Employee Directory:");
        for (Integer id : directory.keySet()) {
            System.out.println(id + " -> " + directory.get(id));
        }

        // c. Search by ID
        int searchId = 103;
        System.out.println("\nEmployee 103: " + directory.getOrDefault(searchId, "Not found"));

        // d. Update employee name
        directory.put(102, "Robert");
        System.out.println("\nAfter update: " + directory);

        // e. Remove employee record
        directory.remove(104);
        System.out.println("\nAfter removal: " + directory);

        // f. Total number of employees
        System.out.println("\nTotal employees: " + directory.size());
    }
}
