package SortingTechs;
import java.util.Scanner;

public class MergeSort {

    // Function to merge two sorted halves of the array
    public static void merge(int[] arr, int l, int m, int r) {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        // Create temporary arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to temporary arrays L[] and R[]
        for (int i = 0; i < n1; i++) L[i] = arr[l + i];
        for (int j = 0; j < n2; j++) R[j] = arr[m + 1 + j];

        // Merge the temporary arrays back into arr[l..r]
        int i = 0, j = 0, k = l;

        // Compare elements from both arrays and copy the smaller one
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        // Copy any remaining elements of L[]
        while (i < n1) {
            arr[k++] = L[i++];
        }

        // Copy any remaining elements of R[]
        while (j < n2) {
            arr[k++] = R[j++];
        }
    }

    // Function to recursively divide and sort the array
    public static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = (l + r) / 2;

            // Recursively sort first and second halves
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    // Utility function to print the array
    public static void printArray(int[] arr) {
        for (int val : arr) System.out.print(val + " ");
        System.out.println();
    }

    // Main method to take dynamic input and call merge sort
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take array size input
        System.out.print("Enter size: ");
        int n = sc.nextInt();

        // Declare and input array elements
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        sc.close();
        // Call merge sort on the array
        mergeSort(arr, 0, n - 1);

        // Print sorted array
        System.out.println("Sorted array:");
        printArray(arr);
    }
}


