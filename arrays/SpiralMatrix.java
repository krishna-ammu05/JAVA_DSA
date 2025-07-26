package arrays;
import java.util.Scanner;

public class SpiralMatrix {

    // Function to read matrix from user
    public static int[][] readMatrix(int rows, int cols, Scanner sc) {
        int[][] matrix = new int[rows][cols]; // declaring

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("matrix[" + i + "][" + j + "] = ");
                matrix[i][j] = sc.nextInt();
            }
        }

        return matrix;
    }

    // Function to print matrix in spiral order
    public static void printSpiral(int[][] matrix, int rows, int cols) {
        int startRow = 0;
        int endRow = rows - 1;
        int startCol = 0;
        int endCol = cols - 1;

        System.out.println("Spiral Order:");

        while (startRow <= endRow && startCol <= endCol) {

            // Top row: left to right
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            // Right column: top to bottom
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            // Bottom row: right to left
            if (startRow != endRow) {
                for (int j = endCol - 1; j >= startCol; j--) {
                    System.out.print(matrix[endRow][j] + " ");
                }
            }

            // Left column: bottom to top
            if (startCol != endCol) {
                for (int i = endRow - 1; i > startRow; i--) {
                    System.out.print(matrix[i][startCol] + " ");
                }
            }

            // Move to next inner layer
            startRow = startRow + 1;
            endRow = endRow - 1;
            startCol = startCol + 1;
            endCol = endCol - 1;
        }

        System.out.println(); // New line after printing spiral order
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = readMatrix(rows, cols, sc);

        printSpiral(matrix, rows, cols);

        sc.close();
    }
}
