interface A {
    void show();
}

interface B {
    void display();
}

class Demo implements A, B {
    public void show() {
        System.out.println("Showing from A");
    }

    public void display() {
        System.out.println("Displaying from B");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.show();
        d.display();
    }
}
