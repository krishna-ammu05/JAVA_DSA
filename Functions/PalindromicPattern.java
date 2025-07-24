package Functions;

public class PalindromicPattern {
   

    // Function to print palindromic number pattern
    public static void print_PalindromicPattern(int n) {
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Print decreasing numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // Print increasing numbers starting from 2
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Move to next line
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {
        print_PalindromicPattern(5); // You can change n for a bigger pattern
    }
}
 

//         1 
//       2 1 2
//     3 2 1 2 3
//   4 3 2 1 2 3 4
// 5 4 3 2 1 2 3 4 5