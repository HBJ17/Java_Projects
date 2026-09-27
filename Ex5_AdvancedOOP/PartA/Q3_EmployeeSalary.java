abstract class Employee {
    protected String employeeId;
    protected String employeeName;
    protected double basicPay;

    public Employee(String employeeId, String employeeName, double basicPay) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicPay = basicPay;
    }

    public abstract double calculateSalary();

    public void displayEmployeeDetails() {
        System.out.println("ID: " + employeeId + " | Name: " + employeeName + " | Basic Pay: " + basicPay);
        System.out.println("Calculated Salary: " + calculateSalary());
    }
}

class Programmer extends Employee {
    public Programmer(String id, String name, double basicPay) { super(id, name, basicPay); }

    @Override
    public double calculateSalary() {
        return basicPay + (0.20 * basicPay); // 20% technical allowance
    }
}

class Manager extends Employee {
    public Manager(String id, String name, double basicPay) { super(id, name, basicPay); }

    @Override
    public double calculateSalary() {
        return basicPay + (0.35 * basicPay); // 35% managerial allowance
    }
}

public class Q3_EmployeeSalary {
    public static void main(String[] args) {
        Employee e1 = new Programmer("P001", "Ravi", 45000);
        Employee e2 = new Manager("M001", "Priya", 70000);

        e1.displayEmployeeDetails();
        e2.displayEmployeeDetails();
    }
}
