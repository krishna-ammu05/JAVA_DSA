package Patterns;

public class HolloRectangle {

    // Method to print hollow rectangle
    public static void hollo_Rectangle(int totRows, int totCols){
        for (int i = 1; i <= totRows; i++) {
            for (int j = 1; j <= totCols; j++) {
                if (i == 1 || i == totRows || j == 1 || j == totCols) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(); // Move to next line after each row
        }
    }

    // Main method inside the class
    public static void main(String[] args) {
        hollo_Rectangle(4, 5);  // Calling the function
    }
}
