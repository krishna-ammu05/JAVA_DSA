
    class Address {
    String city;

    Address(String city) {
        this.city = city;
    }

    // Copy constructor for deep copy
    Address(Address other) {
        this.city = other.city;
    }
}

class DeepCopy {
    String name;
    Address address;

    // Deep copy constructor
    DeepCopy(DeepCopy other) {
        this.name = other.name;
        this.address = new Address(other.address); // 🔁 Deep copy
    }

    DeepCopy(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    void display() {
        System.out.println(name + " from " + address.city);
    }

    public static void main(String[] args) {
        Address addr = new Address("Hyderabad");
        DeepCopy p1 = new DeepCopy("Krishna", addr);

        // Deep copy
        DeepCopy p2 = new DeepCopy(p1);

        System.out.println("Before change:");
        p1.display();  // Krishna from Hyderabad
        p2.display();  // Krishna from Hyderabad

        // Change original's address
        p1.address.city = "Delhi";

        System.out.println("After change:");
        p1.display();  // Krishna from Delhi
        p2.display();  // Krishna from Hyderabad ✅ (deep copy worked)
    }
}


