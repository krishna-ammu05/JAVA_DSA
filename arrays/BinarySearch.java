package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch {

  // Function to performbinary search
    public static int binarySearch(int[] arr, int key) {//passing arr and key
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == key) {
                return mid; // key found
            } else if (arr[mid] < key) {
                start = mid + 1; // search right half
            } else {
                end = mid - 1; // search left half
            }
        }

        return -1; // key not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();

        // Create array
        int[] arr = new int[size];

        // Input elements
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Sort the array (important for binary search)
        Arrays.sort(arr);

        // Input key to search
        System.out.print("Enter the element to search: ");
        int key = scanner.nextInt();

        // Perform binary search
        int result = binarySearch(arr, key);

        // Output result
        if (result != -1) {
            System.out.println("Element " + key + " found at index " + result);
        } else {
            System.out.println("Element " + key + " not found in the array.");
        }

        scanner.close();
    }
}


