package Functions;


public class InvertedRotated {

    // Method to print inverted rotated half pyramid
    public static void print_InvertedRotated(int totalRows) {
        for (int i = 1; i <= totalRows; i++) {
            // Print spaces
            for (int j = 1; j <= totalRows - i; j++) {
                System.out.print("  ");
            }
            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to next line after each row
        }
    }

    // Main method
    public static void main(String[] args) {
        print_InvertedRotated(5); // Call the function with row count
    }
}

//         * 
//       * *
//     * * *
//   * * * *
// * * * * *