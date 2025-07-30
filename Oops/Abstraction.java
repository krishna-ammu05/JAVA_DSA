abstract class Animal {
    // abstract method (no body)
    abstract void sound();

    // concrete method
    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Bird extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Animal a = new Dog();
        Animal b = new Bird();
        a.sound();  // Dog barks
        a.sleep();  // Sleeping...
        b.sound();  // Dog barks
    }
}
