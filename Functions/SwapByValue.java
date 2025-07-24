package Functions;

public class SwapByValue {

    // Method to swap two numbers (ineffective due to call by value)
    public static void swap(int a, int b) {
        // System.out.println("a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;

        System.out.println("Inside swap method:");
        System.out.println("a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        System.out.println("Before swap method call:");
        System.out.println("x = " + x + ", y = " + y);

        // Pass values to swap method
        swap(x, y);

        // Values remain unchanged
        System.out.println("After swap method call:");
        System.out.println("x = " + x + ", y = " + y);
    }
}

