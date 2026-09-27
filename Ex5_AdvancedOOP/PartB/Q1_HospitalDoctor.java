abstract class Doctor {
    protected String doctorId, doctorName;
    protected double consultationFee;

    public Doctor(String doctorId, String doctorName, double consultationFee) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.consultationFee = consultationFee;
    }

    public abstract double calculateBill();
}

interface HospitalService {
    void displayDepartment();
}

class GeneralPhysician extends Doctor implements HospitalService {
    public GeneralPhysician(String id, String name, double fee) { super(id, name, fee); }

    @Override
    public double calculateBill() {
        return consultationFee; // flat fee
    }

    @Override
    public void displayDepartment() {
        System.out.println("Department: General Medicine");
    }
}

class Surgeon extends Doctor implements HospitalService {
    private double surgeryCharge;

    public Surgeon(String id, String name, double fee, double surgeryCharge) {
        super(id, name, fee);
        this.surgeryCharge = surgeryCharge;
    }

    @Override
    public double calculateBill() {
        return consultationFee + surgeryCharge;
    }

    @Override
    public void displayDepartment() {
        System.out.println("Department: Surgery");
    }
}

public class Q1_HospitalDoctor {
    public static void main(String[] args) {
        Doctor d1 = new GeneralPhysician("D001", "Dr. Anand", 500);
        Doctor d2 = new Surgeon("D002", "Dr. Kavya", 800, 5000);

        ((HospitalService) d1).displayDepartment();
        System.out.println(d1.doctorName + " - Bill: " + d1.calculateBill());

        ((HospitalService) d2).displayDepartment();
        System.out.println(d2.doctorName + " - Bill: " + d2.calculateBill());
    }
}
