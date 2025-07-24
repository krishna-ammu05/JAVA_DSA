package Functions;

public class SolidRhombus {

    // Function to print solid rhombus
    public static void print_SolidRhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to next line
        }
    }

    // Main method
    public static void main(String[] args) {
        print_SolidRhombus(5);  // You can change the size here
    }
}
  
//     * * * * *
//    * * * * *
//   * * * * *
//  * * * * *
// * * * * *

