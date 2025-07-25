package SortingTechs;
import java.util.Scanner;

public class QuickSort {

    // Function to perform Quick Sort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Find pivot index after partitioning
            int p = partition(arr, low, high);

            // Recursively sort elements before and after partition
            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    }

    // Function to partition the array around the pivot
    public static int partition(int[] arr, int low, int high) {
        // Choose the last element as pivot
        int pivot = arr[high];

        // Index of smaller element
        int i = low - 1;

        // Traverse through the array
        for (int j = low; j < high; j++) {
            // If current element is smaller than pivot
            if (arr[j] < pivot) {
                i++;  // Increment index of smaller element

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap pivot with element at i + 1
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        // Return pivot index
        return i + 1;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of the array
        System.out.print("Enter size: ");
        int n = sc.nextInt();

        // Input array elements
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        // Call quick sort
        quickSort(arr, 0, n - 1);

        // Print sorted array
        System.out.println("Sorted array:");
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}


