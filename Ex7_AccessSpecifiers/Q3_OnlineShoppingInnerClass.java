class Customer {
    private String name;
    private String id;

    public Customer(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // non-static inner class -- has implicit access to outer Customer instance
    class Order {
        private int orderId;
        private String product;
        private int quantity;

        public Order(int orderId, String product, int quantity) {
            this.orderId = orderId;
            this.product = product;
            this.quantity = quantity;
        }

        void displayOrderDetails() {
            System.out.println("Customer: " + name + " (ID: " + id + ")" +
                    " | Order#" + orderId + " | Product: " + product + " | Qty: " + quantity);
        }
    }
}

public class Q3_OnlineShoppingInnerClass {
    public static void main(String[] args) {
        Customer customer = new Customer("Ananya", "CUST001");

        Customer.Order order1 = customer.new Order(1, "Laptop", 1);
        Customer.Order order2 = customer.new Order(2, "Mouse", 2);

        order1.displayOrderDetails();
        order2.displayOrderDetails();
    }
}
