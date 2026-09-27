class Employee {
    protected String empName, empId, address, mailId, mobileNumber;

    public Employee(String empName, String empId, String address, String mailId, String mobileNumber) {
        this.empName = empName;
        this.empId = empId;
        this.address = address;
        this.mailId = mailId;
        this.mobileNumber = mobileNumber;
    }

    public void generatePaySlip(double basicPay) {
        double da = 0.40 * basicPay;
        double hra = 0.10 * basicPay;
        double pf = 0.20 * basicPay;
        double staffClubFund = 0.005 * basicPay;
        double tax = 0.05 * basicPay; // assumed tax rate

        double grossSalary = basicPay + da + hra;
        double netSalary = grossSalary - pf - staffClubFund - tax;

        System.out.println("---- Pay Slip ----");
        System.out.println("Name: " + empName + " | ID: " + empId);
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("DA: " + da + " | HRA: " + hra);
        System.out.println("PF: " + pf + " | Staff Club: " + staffClubFund + " | Tax: " + tax);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Net Salary: " + netSalary);
        System.out.println("------------------");
    }
}

class Programmer extends Employee {
    public Programmer(String n, String id, String a, String m, String mob) { super(n, id, a, m, mob); }
}

class AssistantProfessor extends Employee {
    public AssistantProfessor(String n, String id, String a, String m, String mob) { super(n, id, a, m, mob); }
}

class AssociateProfessor extends Employee {
    public AssociateProfessor(String n, String id, String a, String m, String mob) { super(n, id, a, m, mob); }
}

class Professor extends Employee {
    public Professor(String n, String id, String a, String m, String mob) { super(n, id, a, m, mob); }
}

public class Q4_EmployeePayroll {
    public static void main(String[] args) {
        Programmer p = new Programmer("Arun", "P001", "Chennai", "arun@x.com", "9000000001");
        p.generatePaySlip(40000);

        AssistantProfessor ap = new AssistantProfessor("Divya", "AP001", "Chennai", "divya@x.com", "9000000002");
        ap.generatePaySlip(60000);

        AssociateProfessor asp = new AssociateProfessor("Kiran", "ASP001", "Chennai", "kiran@x.com", "9000000003");
        asp.generatePaySlip(80000);

        Professor prof = new Professor("Meena", "PR001", "Chennai", "meena@x.com", "9000000004");
        prof.generatePaySlip(100000);
    }
}
