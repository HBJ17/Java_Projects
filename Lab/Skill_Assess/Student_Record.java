import java.io.File;
import java.util.Scanner;

class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class StudentExam extends Person {
    private int rollNumber;
    private int[] marks;

    public StudentExam(String name, int age, int rollNumber, int[] marks) {
        super(name, age);
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public double CalculateAverage() {
        int sum = 0;

        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }

        return (double) sum / marks.length;
    }

    public boolean NameCheck() {
        return name.charAt(0) == 'A';
    }

    public String CheckResult(double average) {
        return (average >= 50) ? "PASS" : "FAIL";
    }

    public void DisplayDetails() {
        double avg = CalculateAverage();

        System.out.println("     Student Exam Report     ");
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Roll No.   : " + rollNumber);

        System.out.print("Marks      : ");
        for (int m : marks) {
            System.out.print(m + " ");
        }

        System.out.println();
        System.out.printf("Average    : %.2f%n", avg);
        System.out.println("Result     : " + CheckResult(avg));
        System.out.println(
            "Name starts with 'A'? : " +
            (NameCheck() ? "Yes" : "No")
        );
    }
}

public class Student_Record {
    public static void main(String[] args) {

        try (Scanner fileScanner =
                     new Scanner(new File("Lab\\Skill_Assess\\Files\\student.txt"))) {

            String name = fileScanner.nextLine().trim();

            int age =
                Integer.parseInt(fileScanner.nextLine().trim());

            int rollNumber =
                Integer.parseInt(fileScanner.nextLine().trim());

            String[] markTokens =
                fileScanner.nextLine().trim().split("\\s+");

            int[] marks = new int[5];

            for (int i = 0; i < 5; i++) {
                marks[i] = Integer.parseInt(markTokens[i]);
            }

            StudentExam student =
                new StudentExam(name, age, rollNumber, marks);

            student.DisplayDetails();

        } catch (Exception e) {
            System.out.println(
                "Error reading student file: " + e.getMessage()
            );
        }
    }
}