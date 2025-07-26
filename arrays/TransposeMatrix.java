package arrays;
import java.util.Scanner;

public class TransposeMatrix {

    // Function to read a matrix from user
    public static int[][] readMatrix(Scanner sc, int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter matrix elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                while (!sc.hasNextInt()) {
                    System.out.print("Invalid input! Please enter an integer: ");
                    sc.next(); // Skip wrong input
                }
                matrix[i][j] = sc.nextInt();
            }
        }

        return matrix;
    }

    // Function to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    // Function to transpose a matrix
    public static int[][] transposeMatrix(int[][] matrix, int rows, int cols) {
        int[][] transposed = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }

        return transposed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Read, transpose, and print
        int[][] matrix = readMatrix(sc, rows, cols);

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        int[][] transposed = transposeMatrix(matrix, rows, cols);

        System.out.println("Transposed Matrix:");
        printMatrix(transposed);

        sc.close(); // Only close after all input is done
    }
}
