package Functions;

public class FloydsTriangle {

    // Method to print Floyd's Triangle
    public static void print_FloydsTriangle(int totalRows) {
        int number = 1; // Start with 1
        for (int i = 1; i <= totalRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " "); // Print current number
                number++; // Increment
            }
            System.out.println(); // New line after each row
        }
    }

    // Main method
    public static void main(String[] args) {
        print_FloydsTriangle(5); // Call the method with 5 rows
    }
}


// 1 
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15