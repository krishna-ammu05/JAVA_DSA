package arrays;
import java.util.Scanner;

public class MaxSubArray {

    // Function to find maximum subarray sum using brute force
    public static int findMaxSubarraySum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;

        for (int start = 0; start < arr.length; start++) {
            int currentSum = 0;

            for (int end = start; end < arr.length; end++) {
                // Add current element to current sum
                currentSum += arr[end];

                // Update max if needed
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }

        return maxSum;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        // Input array elements
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Call the function
        int maxSum = findMaxSubarraySum(arr);

        // Output
        System.out.println("Maximum subarray sum is: " + maxSum);

        scanner.close();
    }
}


