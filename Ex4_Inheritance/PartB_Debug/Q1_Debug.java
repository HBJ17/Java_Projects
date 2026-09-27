/*
 * Error: "class Dog inherits Animal" is invalid syntax -- Java uses the
 * keyword 'extends' for inheritance, not 'inherits'. Also,
 * "Dog d = new Animal();" is invalid: you cannot assign a superclass
 * object (Animal) to a subclass reference (Dog) without an explicit
 * downcast, and even then it would fail at runtime since the actual
 * object isn't a Dog.
 * Fix: use 'extends' and create the Dog object properly.
 */
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal { // fixed: 'extends' instead of 'inherits'
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class Q1_Debug {
    public static void main(String[] args) {
        Dog d = new Dog(); // fixed: create a Dog, not an Animal
        d.eat();
        d.bark();
    }
}
