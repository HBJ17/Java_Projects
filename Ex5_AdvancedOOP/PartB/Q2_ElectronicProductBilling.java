interface Discount {
    double calculateDiscount(double price);
}

interface GST {
    double calculateGST(double price);
}

abstract class Product {
    protected String productId, productName;
    protected double price;

    public Product(String productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public abstract double generateBill();
}

class ElectronicProduct extends Product implements Discount, GST {
    public ElectronicProduct(String id, String name, double price) { super(id, name, price); }

    @Override
    public double calculateDiscount(double price) {
        return price * 0.10; // 10% discount
    }

    @Override
    public double calculateGST(double price) {
        return price * 0.18; // 18% GST
    }

    @Override
    public double generateBill() {
        double discount = calculateDiscount(price);
        double priceAfterDiscount = price - discount;
        double gst = calculateGST(priceAfterDiscount);
        return priceAfterDiscount + gst;
    }
}

public class Q2_ElectronicProductBilling {
    public static void main(String[] args) {
        ElectronicProduct laptop = new ElectronicProduct("E001", "Laptop", 50000);
        System.out.println("Product: " + laptop.productName);
        System.out.println("Final Bill after Discount and GST: " + laptop.generateBill());
    }
}
