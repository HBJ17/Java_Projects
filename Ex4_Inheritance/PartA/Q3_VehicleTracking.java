class Vehicle {
    protected String vehicleNumber;

    public Vehicle(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public void displayInfo() {
        System.out.println("Vehicle Number: " + vehicleNumber);
    }
}

class LandVehicle extends Vehicle {
    protected int numberOfWheels;

    public LandVehicle(String vehicleNumber, int numberOfWheels) {
        super(vehicleNumber);
        this.numberOfWheels = numberOfWheels;
    }
}

class Truck extends LandVehicle {
    private double cargoCapacity;

    public Truck(String vehicleNumber, int numberOfWheels, double cargoCapacity) {
        super(vehicleNumber, numberOfWheels);
        this.cargoCapacity = cargoCapacity;
    }

    public double calculateMaximumLoad() {
        return cargoCapacity * 100;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Wheels: " + numberOfWheels);
        System.out.println("Cargo Capacity: " + cargoCapacity);
        System.out.println("Maximum Load: " + calculateMaximumLoad());
    }
}

public class Q3_VehicleTracking {
    public static void main(String[] args) {
        Truck truck = new Truck("TN09TR1234", 6, 12.5);
        truck.displayInfo();
    }
}
