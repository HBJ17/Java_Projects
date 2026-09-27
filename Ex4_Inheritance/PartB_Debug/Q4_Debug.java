/*
 * Error: Person's 'name' field is private, so it is NOT inherited/
 * accessible in the subclass Student. Referencing 'name' directly inside
 * Student.display() causes a compile error "name has private access in
 * Person".
 * Fix: either make the field protected/public, or provide a protected/
 * public getter method in Person that Student can call.
 */
class Person4 {
    private String name = "John";

    protected String getName() { // fixed: added a getter for controlled access
        return name;
    }
}

class Student4 extends Person4 {
    void display() {
        System.out.println(getName()); // fixed: use getter instead of direct field access
    }
}

public class Q4_Debug {
    public static void main(String[] args) {
        Student4 s = new Student4();
        s.display();
    }
}
