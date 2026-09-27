class Department {
    private String deptCode;
    String deptName; // default access

    public Department(String deptCode, String deptName) {
        this.deptCode = deptCode;
        this.deptName = deptName;
    }

    protected void printDepartmentInfo() {
        System.out.println("Dept Code: " + deptCode + " | Dept Name: " + deptName);
    }

    public void getDeptDetails() {
        printDepartmentInfo();
    }
}

class Student extends Department {
    private String[] subjectCodes = new String[5];
    private int subjectCount = 0;

    public Student(String deptCode, String deptName) {
        super(deptCode, deptName);
    }

    protected void addSubject(String code) {
        if (subjectCount < subjectCodes.length) {
            subjectCodes[subjectCount++] = code;
        } else {
            System.out.println("Cannot add more subjects, limit reached.");
        }
    }

    public void displaySubjects() {
        System.out.print("Subjects: ");
        for (int i = 0; i < subjectCount; i++) {
            System.out.print(subjectCodes[i] + " ");
        }
        System.out.println();
    }

    // non-static inner class
    class Attendance {
        private int[][] attendanceRecord = new int[5][30]; // 5 subjects x 30 days

        void markAttendance(int subjectIndex, int day, int present) {
            if (subjectIndex >= 0 && subjectIndex < 5 && day >= 0 && day < 30) {
                attendanceRecord[subjectIndex][day] = present;
            }
        }

        void viewAttendance(int subjectIndex) {
            System.out.print("Attendance for subject " + subjectCodes[subjectIndex] + ": ");
            for (int d = 0; d < 30; d++) {
                System.out.print(attendanceRecord[subjectIndex][d]);
            }
            System.out.println();
        }
    }
}

public class Q5_SmartAttendanceSystem {
    public static void main(String[] args) {
        Student student = new Student("IT", "Information Technology");
        student.getDeptDetails();

        student.addSubject("UIT301");
        student.addSubject("UIT302");
        student.displaySubjects();

        Student.Attendance attendance = student.new Attendance();
        attendance.markAttendance(0, 0, 1);
        attendance.markAttendance(0, 1, 1);
        attendance.markAttendance(0, 2, 0);
        attendance.viewAttendance(0);
    }
}
