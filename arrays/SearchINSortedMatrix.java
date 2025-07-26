package arrays;
import java.util.Scanner;

public class SearchINSortedMatrix {
     // Function to search target in sorted matrix
    public static boolean searchInMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Start from top-right
        int i = 0, j = cols - 1;

        while (i < rows && j >= 0) {
            if (matrix[i][j] == target) {
                System.out.println("Element found at position: (" + i + ", " + j + ")");
                return true;
            } else if (matrix[i][j] > target) {
                j--; // Move left
            } else {
                i++; // Move down
            }
        }

        System.out.println("Element not found in matrix.");
        return false;
    }

    // Function to take matrix input
    public static int[][] inputMatrix(int rows, int cols, Scanner sc) {
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of the matrix (sorted row and column-wise):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Dynamic input
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Input matrix
        int[][] matrix = inputMatrix(rows, cols, sc);

        // Input target
        System.out.print("Enter the element to search: ");
        int target = sc.nextInt();

        // Search
        searchInMatrix(matrix, target);

        sc.close();
    }
}


