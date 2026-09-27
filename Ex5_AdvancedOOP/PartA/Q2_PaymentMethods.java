class Payment {
    public void makePayment(double amount) {
        System.out.println("Generic payment of " + amount);
    }
}

class CreditCardPayment extends Payment {
    @Override
    public void makePayment(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}

class DebitCardPayment extends Payment {
    @Override
    public void makePayment(double amount) {
        System.out.println("Paid " + amount + " using Debit Card");
    }
}

class UPIPayment extends Payment {
    @Override
    public void makePayment(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

public class Q2_PaymentMethods {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        Payment p2 = new DebitCardPayment();
        Payment p3 = new UPIPayment();

        p1.makePayment(1500.0);
        p2.makePayment(750.0);
        p3.makePayment(300.0);
    }
}
