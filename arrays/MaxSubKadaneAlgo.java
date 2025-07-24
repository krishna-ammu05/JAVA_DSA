package arrays;
import java.util.Scanner;

public class MaxSubKadaneAlgo {

    // Function to find maximum subarray sum using Kadane's Algorithm
    public static int findMaxSubarraySum(int[] arr) {
        int maxSoFar = arr[0];
        int currentMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        // Input array elements
        System.out.println("Enter " + size + " elements (can include negatives):");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Get the result from the function
        int maxSum = findMaxSubarraySum(arr);

        // Print result
        System.out.println("Maximum subarray sum is: " + maxSum);

        scanner.close();
    }
}
