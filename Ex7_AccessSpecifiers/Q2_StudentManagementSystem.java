package school; // Note: place this file inside a 'school' folder to actually compile as a package.

class Student {
    private String name;
    String rollNo;     // default access
    protected double marks;

    public Student(String name, String rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + " | Roll No: " + rollNo + " | Marks: " + marks);
    }
}

class ExamResult extends Student {
    public ExamResult(String name, String rollNo, double marks) {
        super(name, rollNo, marks);
    }

    void showAccessibleMembers() {
        // name is private in Student -> NOT accessible here
        System.out.println("rollNo (default, same package/subclass): " + rollNo);
        System.out.println("marks (protected, inherited): " + marks);
    }
}

public class Q2_StudentManagementSystem {
    public static void main(String[] args) {
        Student s = new Student("Divya", "IT101", 88.5);
        s.displayInfo();

        ExamResult result = new ExamResult("Karthik", "IT102", 91.0);
        result.showAccessibleMembers();
        result.displayInfo();
    }
}
