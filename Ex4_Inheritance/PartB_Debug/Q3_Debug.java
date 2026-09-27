/*
 * Error: Manager's no-arg constructor implicitly calls super() (Employee's
 * no-arg constructor), but Employee only defines a constructor that takes
 * a String parameter -- there is no matching no-arg constructor in
 * Employee. This causes a compilation error.
 * Fix: explicitly call super("someName") with a matching argument from
 * Manager's constructor.
 */
class Employee3 {
    Employee3(String name) {
        System.out.println("Employee : " + name);
    }
}

class Manager3 extends Employee3 {
    Manager3() {
        super("Default Manager"); // fixed: explicit super call with argument
        System.out.println("Manager Created");
    }
}

public class Q3_Debug {
    public static void main(String[] args) {
        Manager3 m = new Manager3();
    }
}
