// File: Functions/SwapByReference.java
package Functions;

class Number {
    int value;

    Number(int value) {
        this.value = value;
    }
}

public class SwapByRef {

    // Method to swap the values inside the objects
    public static void swap(Number a, Number b) {
        int temp = a.value;
        a.value = b.value;
        b.value = temp;

        System.out.println("Inside swap method:");
        System.out.println("a = " + a.value + ", b = " + b.value);
    }

    public static void main(String[] args) {
        Number x = new Number(10);
        Number y = new Number(20);

        System.out.println("Before swap method:");
        System.out.println("x = " + x.value + ", y = " + y.value);

        swap(x, y);

        System.out.println("After swap method:");
        System.out.println("x = " + x.value + ", y = " + y.value);
    }
}
