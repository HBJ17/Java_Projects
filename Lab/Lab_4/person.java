package Lab.Lab_4;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Person name is : " + name);
    }
}

class Student extends Person {
    String name;

    Student(String parentname, String studentname) {
        super(parentname);
        this.name = studentname;
    }

    void display() {
        super.display();
        System.out.println("Parent's name (super.name): " + super.name);
        System.out.println("Student's own name: " + name);
    }

}

public class person {
    public static void main(String[] args) {
        Student s = new Student("Mr. Kumar", "Rahul");
        s.display();
    }
}
