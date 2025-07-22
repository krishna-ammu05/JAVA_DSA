package Loops;

public class squarePattern {
    public static void main(String[] args) {
        int n = 5; // Size of the square pattern

        // Outer loop for each row
        for (int i = 0; i < n; i++) {
            // Inner loop for each column
            for (int j = 0; j < n; j++) {
                System.out.print("* "); // Print star followed by space
            }
            System.out.println(); // Move to the next line after each row
        }
        
        // Note: This code prints a square pattern of stars with size n x n.
    }
}
