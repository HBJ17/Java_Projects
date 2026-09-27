class Product<T> {
    private T id;

    public Product(T id) {
        this.id = id;
    }

    public boolean compareId(T otherId) {
        return id.equals(otherId);
    }

    public T getId() {
        return id;
    }
}

public class Q2_ProductGeneric {
    public static void main(String[] args) {
        Product<Integer> numericProduct = new Product<>(101);
        System.out.println("Compare 101 with 101: " + numericProduct.compareId(101));
        System.out.println("Compare 101 with 102: " + numericProduct.compareId(102));

        Product<String> alphaProduct = new Product<>("P001");
        System.out.println("Compare P001 with P001: " + alphaProduct.compareId("P001"));
        System.out.println("Compare P001 with P002: " + alphaProduct.compareId("P002"));
    }
}
