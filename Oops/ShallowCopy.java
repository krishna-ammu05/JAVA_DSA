class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}

class ShallowCopy {
    String name;
    Address address;

    // Shallow copy constructor
    ShallowCopy(ShallowCopy other) {
        this.name = other.name;
        this.address = other.address; // 🔁 Reference copied (shallow)
    }

    ShallowCopy(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    void display() {
        System.out.println(name + " from " + address.city);
    }

    public static void main(String[] args) {
        Address addr = new Address("Hyderabad");
        ShallowCopy p1 = new ShallowCopy("Krishna", addr);

        // Create a shallow copy
        ShallowCopy p2 = new ShallowCopy(p1);

        System.out.println("Before change:");
        p1.display();  // Krishna from Hyderabad
        p2.display();  // Krishna from Hyderabad

        // Modify address of p1
        p1.address.city = "Delhi";

        System.out.println("After change:");
        p1.display();  // Krishna from Delhi
        p2.display();  // Krishna from Delhi (changed due to shallow copy)
    }
}
