/*
 * This program actually compiles and runs correctly as-is.
 * Output:
 * Animal is eating
 * Dog is barking
 *
 * Explanation: Animal a = new Dog() is valid because Dog IS-A Animal
 * (upcasting). Calling a.eat() works since eat() is inherited.
 * a.bark() ALSO works here because Dog does not override eat() and
 * bark() is called directly on a Dog object stored in an Animal
 * reference -- however, this would actually be a COMPILE ERROR because
 * the reference type 'Animal' does not declare bark(), so the compiler
 * won't allow a.bark() unless it is cast to Dog.
 * Fix: cast the reference to Dog before calling bark().
 */
class Animal2 {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog2 extends Animal2 {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class Q2_Debug {
    public static void main(String[] args) {
        Animal2 a = new Dog2();
        a.eat();
        ((Dog2) a).bark(); // fixed: downcast to access subclass-only method
    }
}
