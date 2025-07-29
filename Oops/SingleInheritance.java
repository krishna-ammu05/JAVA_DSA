class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class SingleInheritance extends Animal {
    void bark() {
        System.out.println("Barking...");
    }

    public static void main(String[] args) {
        SingleInheritance d = new SingleInheritance();
        d.eat();   // inherited from Animal
        d.bark();  // method of SingleInheritance
    }
}
