package BackTracking;
import java.util.Scanner;

public class CountWays {
    
    static int N; // Board size
    static int solutionCount = 0; // Count total solutions

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the board (N): ");
        N = sc.nextInt();
        sc.close();

        int[][] board = new int[N][N];

        if (!solveNQueens(board, 0)) {
            System.out.println("No solution exists");
        } else {
            System.out.println("Total Solutions: " + solutionCount);
        }
    }

    // Recursive function to solve N-Queens
    static boolean solveNQueens(int[][] board, int row) {
        if (row == N) {//base case 
            
            printBoard(board);
            System.out.println();
            solutionCount++; // Increase count for each valid solution
            return true;
        }

        boolean foundSolution = false;
        for (int col = 0; col < N; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 1; // Place queen
                foundSolution = solveNQueens(board, row + 1) || foundSolution;
                board[row][col] = 0; // Backtrack
            }
        }
        return foundSolution;
    }

    // Check if placing queen is safe
    static boolean isSafe(int[][] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1) return false;
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) return false;
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < N; i--, j++) {
            if (board[i][j] == 1) return false;
        }
        return true;
    }

    // Print the board
    static void printBoard(int[][] board) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(board[i][j] == 1 ? "Q " : ". ");
            }
            System.out.println();
        }
    }
}


