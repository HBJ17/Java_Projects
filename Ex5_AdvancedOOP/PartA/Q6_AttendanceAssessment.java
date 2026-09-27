interface Attendance {
    double calculateAttendancePercentage();
}

interface Assessment {
    double calculateInternalMarks();
}

class StudentResult implements Attendance, Assessment {
    private int classesAttended, totalClasses;
    private double[] internalScores;

    public StudentResult(int classesAttended, int totalClasses, double[] internalScores) {
        this.classesAttended = classesAttended;
        this.totalClasses = totalClasses;
        this.internalScores = internalScores;
    }

    @Override
    public double calculateAttendancePercentage() {
        return (classesAttended * 100.0) / totalClasses;
    }

    @Override
    public double calculateInternalMarks() {
        double sum = 0;
        for (double s : internalScores) sum += s;
        return sum / internalScores.length;
    }

    public void checkEligibility() {
        double attendance = calculateAttendancePercentage();
        double internal = calculateInternalMarks();
        System.out.println("Attendance: " + attendance + "% | Internal Marks: " + internal);

        if (attendance >= 75 && internal >= 40) {
            System.out.println("Eligible for semester examination");
        } else {
            System.out.println("Not eligible for semester examination");
        }
    }
}

public class Q6_AttendanceAssessment {
    public static void main(String[] args) {
        StudentResult sr = new StudentResult(80, 100, new double[]{45, 50, 42});
        sr.checkEligibility();
    }
}
