// Parent class (superclass)
class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}

// Child class (subclass)
class Inheritance extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        Inheritance d = new Inheritance();
        d.eat();   // inherited from Animal
        d.bark();  // from Inheritance
    }
}
