package Functions;

public class DiamondPattern {

    // Function to print full diamond pattern with 2*i - 1 stars
    public static void print_Diamond(int n) {
        // Upper half
        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Stars (2*i - 1)
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Stars (2*i - 1)
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {
        print_Diamond(5);  // Adjust n to change size
    }
}
