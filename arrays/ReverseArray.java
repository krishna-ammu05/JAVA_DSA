package arrays;
import java.util.Scanner;
public class ReverseArray {
    

    // Function to reverse the array
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap elements at start and end
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    // Function to print the array
    public static void printArray(int[] arr) {
        System.out.print("Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();

        // Create array
        int[] arr = new int[size];

        // Input elements
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Print original array
        System.out.println("\nOriginal Array:");
        printArray(arr);

        // Reverse the array
        reverseArray(arr);

        // Print reversed array
        System.out.println("Reversed Array:");
        printArray(arr);

        scanner.close();
    }
}


