package Functions;

public class PascalsTriangle {
   
    // Function to calculate factorial
    static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Function to calculate binomial coefficient C(n, k)
    static int binomialCoeff(int n, int k) {
        return factorial(n) / (factorial(k) * factorial(n - k));
    }

    // Function to print Pascal's Triangle
    static void printPascal(int n) {
        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // Print binomial coefficients
            for (int k = 0; k <= i; k++) {
                System.out.print(binomialCoeff(i, k) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int rows = 6; // Change this value to get more rows
        printPascal(rows);
    }
}


//      1 
//     1 1
//    1 2 1
//   1 3 3 1
//  1 4 6 4 1
// 1 5 10 10 5 1