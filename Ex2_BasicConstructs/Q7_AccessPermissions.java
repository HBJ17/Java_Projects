import java.util.Scanner;

public class Q7_AccessPermissions {
    public static void main(String[] args) {
        final int READ = 1, WRITE = 2, EXECUTE = 4;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter access value: ");
        int access = sc.nextInt();

        System.out.println("Permissions granted:");
        if ((access & READ) != 0) System.out.println("Read");
        if ((access & WRITE) != 0) System.out.println("Write");
        if ((access & EXECUTE) != 0) System.out.println("Execute");

        sc.close();
    }
}
