package BitManipulation;
import java.util.Scanner;
public class Operations {
    
    // Function to get the i-th bit
    public static int getBit(int n, int i) {
        return (n & (1 << i)) != 0 ? 1 : 0;
    }

    // Function to set the i-th bit
    public static int setBit(int n, int i) {
        return n | (1 << i);
    }

    // Function to clear the i-th bit
    public static int clearBit(int n, int i) {
        return n & ~(1 << i);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (n): ");
        int n = sc.nextInt();

        System.out.print("Enter bit position (i): ");
        int i = sc.nextInt();
        
        // Perform all three operations
        int getResult = getBit(n, i);
        int setResult = setBit(n, i);
        int clearResult = clearBit(n, i);
        sc.close();
        System.out.println("\n--- Bit Manipulation Results ---");
        System.out.println("Original number       : " + n);
        System.out.println("Binary                : " + Integer.toBinaryString(n));
        System.out.println("Get Bit at position " + i + "   : " + getResult);
        System.out.println("After Setting Bit     : " + setResult + " (Binary: " + Integer.toBinaryString(setResult) + ")");
        System.out.println("After Clearing Bit    : " + clearResult + " (Binary: " + Integer.toBinaryString(clearResult) + ")");
    }
}


