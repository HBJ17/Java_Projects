interface Sports {
    double calculateSportsScore();
}

class Student implements Sports {
    private String studentId;
    private String studentName;
    private int participationPoints;

    public Student(String studentId, String studentName, int participationPoints) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.participationPoints = participationPoints;
    }

    @Override
    public double calculateSportsScore() {
        return participationPoints * 1.5; // sample weighting formula
    }

    public void displayDetails() {
        System.out.println("Student ID: " + studentId + " | Name: " + studentName);
        System.out.println("Sports Score: " + calculateSportsScore());
    }
}

public class Q5_SportsInterface {
    public static void main(String[] args) {
        Student s = new Student("S001", "Arjun", 20);
        s.displayDetails();
    }
}
