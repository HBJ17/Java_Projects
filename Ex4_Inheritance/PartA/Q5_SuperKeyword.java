class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Person name: " + name);
    }
}

class Student extends Person {
    String name; // shadows Person's name field

    public Student(String personName, String studentName) {
        super(personName);         // use 1: invoke parent constructor
        this.name = studentName;
    }

    public void display() {
        super.display();                          // use 3: invoke parent method
        System.out.println("Parent's name field via super.name: " + super.name); // use 2
        System.out.println("Student's own name field: " + this.name);
    }
}

public class Q5_SuperKeyword {
    public static void main(String[] args) {
        Student student = new Student("Person-Level Name", "Student-Level Name");
        student.display();
    }
}
