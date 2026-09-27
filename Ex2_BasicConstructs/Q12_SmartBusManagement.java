import java.util.Scanner;

public class Q12_SmartBusManagement {
    public static void main(String[] args) {
        final int TOTAL_SEATS = 20;
        int[] seats = new int[TOTAL_SEATS]; // 0 = available, 1 = booked
        double totalFare = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Select route type: 1.City(Rs.20) 2.Intercity(Rs.50) 3.Express(Rs.80)");
        int routeType = sc.nextInt();
        double fare;
        switch (routeType) {
            case 1: fare = 20; break;
            case 2: fare = 50; break;
            case 3: fare = 80; break;
            default:
                System.out.println("Invalid route. Defaulting to City fare.");
                fare = 20;
        }

        System.out.print("Enter number of bookings to make: ");
        int bookings = sc.nextInt();

        for (int b = 0; b < bookings; b++) {
            System.out.print("Enter seat number (1-" + TOTAL_SEATS + "): ");
            int seatNo = sc.nextInt();

            if (seatNo < 1 || seatNo > TOTAL_SEATS) {
                System.out.println("Invalid seat number.");
                continue;
            }
            if (seats[seatNo - 1] == 1) {
                System.out.println("Seat already booked.");
                continue;
            }

            System.out.print("Enter passenger age: ");
            int age = sc.nextInt();
            double finalFare = (age >= 60) ? fare * 0.9 : fare;

            seats[seatNo - 1] = 1;
            totalFare += finalFare;
            System.out.println("Seat " + seatNo + " booked. Fare charged: " + finalFare);
        }

        System.out.println("\nTotal fare collected: " + totalFare);
        System.out.print("Booked seats: ");
        StringBuilder occupancy = new StringBuilder();
        for (int i = 0; i < TOTAL_SEATS; i++) {
            if (seats[i] == 1) System.out.print((i + 1) + " ");
            occupancy.append(seats[i]);
        }
        System.out.println("\nSeat occupancy: " + occupancy);

        sc.close();
    }
}
