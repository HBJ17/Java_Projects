class Base {
    private int x = 10;
    int y = 20;             // default (package-private)
    protected int z = 30;
    public int w = 40;

    public void showBaseAll() {
        System.out.println("Inside Base -> x:" + x + " y:" + y + " z:" + z + " w:" + w);
    }
}

class Derived extends Base {
    void showAccessibleFromSubclass() {
        // x is NOT accessible here -- private to Base only (compile error if uncommented)
        // System.out.println(x);
        System.out.println("y (default, same package): " + y);
        System.out.println("z (protected, inherited): " + z);
        System.out.println("w (public): " + w);
    }
}

public class Q1_AccessSpecifiersDemo {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.showAccessibleFromSubclass();

        // AccessTest-style checks directly here (same package/class, so treated like AccessTest)
        // d.x -> compile error: x has private access in Base
        System.out.println("d.y = " + d.y); // accessible: same package
        System.out.println("d.z = " + d.z); // accessible: protected, same package/subclass
        System.out.println("d.w = " + d.w); // accessible: public
    }
}
