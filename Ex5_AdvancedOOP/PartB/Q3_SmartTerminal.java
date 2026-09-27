interface CampusDevice {
    void powerOn();
}

interface AttendanceSystem extends CampusDevice {
    void markAttendance();
}

interface SecuritySystem extends CampusDevice {
    void grantAccess();
}

abstract class Device {
    protected String deviceId, location;

    public Device(String deviceId, String location) {
        this.deviceId = deviceId;
        this.location = location;
    }

    public void displayDeviceDetails() {
        System.out.println("Device ID: " + deviceId + " | Location: " + location);
    }
}

class SmartTerminal extends Device implements AttendanceSystem, SecuritySystem {
    public SmartTerminal(String id, String location) { super(id, location); }

    @Override
    public void powerOn() {
        System.out.println("SmartTerminal powered on.");
    }

    @Override
    public void markAttendance() {
        System.out.println("Attendance marked via SmartTerminal.");
    }

    @Override
    public void grantAccess() {
        System.out.println("Access granted via SmartTerminal.");
    }
}

public class Q3_SmartTerminal {
    public static void main(String[] args) {
        SmartTerminal terminal = new SmartTerminal("ST001", "Main Gate");
        terminal.displayDeviceDetails();
        terminal.powerOn();
        terminal.markAttendance();
        terminal.grantAccess();
    }
}
