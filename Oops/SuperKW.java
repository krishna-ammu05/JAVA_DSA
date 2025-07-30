// Parent Class
class Animal {
    String color = "White";

    // Constructor of parent class
    Animal() {
        System.out.println("Animal constructor called");
    }

    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child Class
class Dog extends Animal {
    String color = "Black";

    // 1️⃣ Constructor of child class
    Dog() {
        super(); // Calling parent constructor
        System.out.println("Dog constructor called");
    }

    // 2️⃣ Method to demonstrate variable shadowing and super.variable
    void printColor() {
        System.out.println("Child class color (this.color): " + color);         // Own variable
        System.out.println("Parent class color (super.color): " + super.color); // Parent variable
    }

    // 3️⃣ Overriding method from parent
    void eat() {
        System.out.println("Dog is eating");
    }

    // 4️⃣ Method calling both overridden and parent method
    void showEating() {
        System.out.println("Calling parent class method using super:");
        super.eat();  // Call parent version
        System.out.println("Calling child class overridden method:");
        eat();        // Call own version
    }

  
  public class SuperKW {
   // Main method
    public static void main(String[] args) {
        System.out.println("Creating Dog object:");
        Dog d = new Dog();  // Constructor chain
        System.out.println("\nAccessing variables:");
        d.printColor();     // Access parent & child variables
        System.out.println("\nCalling methods:");
        d.showEating();     // Call parent & child methods
    }
}
}