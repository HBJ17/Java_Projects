class Vehicle {
    protected String vehicleNumber;
    protected double speed;

    public Vehicle(String vehicleNumber, double speed) {
        this.vehicleNumber = vehicleNumber;
        this.speed = speed;
    }

    public double calculateTravelTime(double distance) {
        return distance / speed;
    }
}

class Car extends Vehicle {
    public Car(String vehicleNumber, double speed) { super(vehicleNumber, speed); }

    @Override
    public double calculateTravelTime(double distance) {
        double time = distance / speed;
        System.out.println("Car " + vehicleNumber + " travel time for " + distance + " km: " + time + " hours");
        return time;
    }
}

class Train extends Vehicle {
    public Train(String vehicleNumber, double speed) { super(vehicleNumber, speed); }

    @Override
    public double calculateTravelTime(double distance) {
        double time = distance / speed;
        System.out.println("Train " + vehicleNumber + " travel time for " + distance + " km: " + time + " hours");
        return time;
    }
}

public class Q1_VehicleTravelTime {
    public static void main(String[] args) {
        Vehicle car = new Car("CAR-01", 80);
        Vehicle train = new Train("TRAIN-01", 120);

        car.calculateTravelTime(240);
        train.calculateTravelTime(240);
    }
}
