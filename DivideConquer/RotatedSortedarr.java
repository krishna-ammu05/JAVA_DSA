package DivideConquer;
import java.util.Scanner;
public class RotatedSortedarr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the rotated sorted array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target element to search:");
        int target = sc.nextInt();
        sc.close();

        int result = search(arr, 0, n - 1, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }

    public static int search(int[] arr, int low, int high, int target) {
        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target)
                return mid;

            // Check if left part is sorted
            if (arr[low] <= arr[mid]) {
                // Target lies in left half
                if (target >= arr[low] && target < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            // Otherwise, right part is sorted
            else {
                // Target lies in right half
                if (target > arr[mid] && target <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1; // not found
    }
}

