class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}

public class MultilevelInheritance extends Dog {
    void weep() {
        System.out.println("Weeping...");
    }

    public static void main(String[] args) {
        MultilevelInheritance p = new MultilevelInheritance();
        p.eat();   // from Animal
        p.bark();  // from Dog
        p.weep();  // from MultilevelInheritance
    }
}
