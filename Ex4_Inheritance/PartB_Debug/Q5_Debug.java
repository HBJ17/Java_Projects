/*
 * Error: "Animal d = new Animal(); d.bark();" fails to compile because
 * the reference type is Animal, and Animal does not have a bark()
 * method -- bark() is only defined in the Dog subclass. The compiler
 * checks method availability based on the REFERENCE type, not the
 * actual object type.
 * Fix: declare the reference as Dog (or cast to Dog) so bark() is
 * accessible; here we simply create it as a Dog since we want to bark.
 */
class Animal5 {
    void eat() {
        System.out.println("Eating");
    }
}

class Dog5 extends Animal5 {
    void bark() {
        System.out.println("Barking");
    }
}

public class Q5_Debug {
    public static void main(String[] args) {
        Dog5 d = new Dog5(); // fixed: declared as Dog, not Animal
        d.bark();
    }
}
