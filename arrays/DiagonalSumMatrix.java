package arrays;
import java.util.Scanner;

public class DiagonalSumMatrix {

    // Function to read matrix
    public static int[][] readMatrix(int rows, int cols, Scanner sc) {
        int[][] matrix = new int[rows][cols];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("matrix[" + i + "][" + j + "] = ");
                matrix[i][j] = sc.nextInt();
            }
        }

        return matrix;
    }

    // Function to print matrix
   public static void printMatrix(int[][] matrix) {
    System.out.println("Matrix:");
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }
}

    // Function to calculate diagonal sums
    public static void calculateDiagonalSums(int[][] matrix, int rows, int cols) {
        int primarySum = 0;
        int secondarySum = 0;
    //     for (int i = 0; i < rows; i++) {
    //     for (int j = 0; j < cols; j++) {
    //         // Primary diagonal: where row == column
    //         if (i == j) {
    //             primarySum += matrix[i][j];
    //         }

    //         // Secondary diagonal: where row + column == size - 1
    //         if (i + j == cols - 1) {
    //             secondarySum += matrix[i][j];
    //         }
    //     }
    // }
// complexity is O(n^2) decreases to O(n) as we only need to iterate through the rows
        for (int i = 0; i < rows; i++) {
            primarySum += matrix[i][i]; // Primary diagonal

            if (i != cols - 1 - i) { // Avoid double-counting center element
                secondarySum += matrix[i][cols - 1 - i]; // Secondary diagonal
            }
        }

        System.out.println("Primary Diagonal Sum = " + primarySum);
        System.out.println("Secondary Diagonal Sum = " + secondarySum);
        System.out.println("Total Diagonal Sum = " + (primarySum + secondarySum));
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        if (rows != cols) {
            System.out.println("Diagonal sum is only valid for square matrices.");
        } else {
            int[][] matrix = readMatrix(rows, cols, sc);
            printMatrix(matrix);
            calculateDiagonalSums(matrix, rows, cols);
        }

        sc.close();
    }
}

