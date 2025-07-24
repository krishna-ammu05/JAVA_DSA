package Functions;
//Defining multiple methods with the same name, but with different parameters (number, type, or order).
//Java decides which method to call at compile time, based on the arguments passed.

public  class Overloading {

    // Method 1: Add two integers
    public int add(int a, int b) {
        System.out.println("Adding two integers:");
        return a + b;
    }

    // Method 2: Add two doubles
    public double add(double a, double b) {
        System.out.println("Adding two doubles:");
        return a + b;
    }

    // Method 3: Add three integers
    public int add(int a, int b, int c) {
        System.out.println("Adding three integers:");
        return a + b + c;
    }

    // Method 4: Add one int and one double
    public double add(int a, double b) {
        System.out.println("Adding int and double:");
        return a + b;
    }

    // Method 5: Add one double and one int
    public double add(double a, int b) {
        System.out.println("Adding double and int:");
        return a + b;
    }

    public static void main(String[] args) {
        Overloading obj = new Overloading();

        System.out.println("Result: " + obj.add(10, 20));            // int, int
        System.out.println("Result: " + obj.add(5.5, 6.7));          // double, double
        System.out.println("Result: " + obj.add(1, 2, 3));           // int, int, int
        System.out.println("Result: " + obj.add(10, 3.5));           // int, double
        System.out.println("Result: " + obj.add(4.5, 5));            // double, int
    }
}
 
