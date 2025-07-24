package Functions;

public class InvertedNum {
    
    // Method to print inverted number pattern
    public static void print_InvertedNum(int totalRows) {
        for (int i = totalRows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); // Move to next line after each row
        }
    }

    // Main method
    public static void main(String[] args) {
        print_InvertedNum(5); // Call the function with row count
    }
}

// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1