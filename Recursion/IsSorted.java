package Recursion;
import java.util.Scanner;
public class IsSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        boolean result = isSorted(arr, 0);
        System.out.println("Array is sorted: " + result);
    }

    public static boolean isSorted(int[] arr, int index) {
        // Base case: if we reached the second last element or array is empty/single element
        if (index == arr.length - 1 || arr.length == 0) {
            return true;
        }
         // If current element is greater than next one, array is not sorted
        if (arr[index] > arr[index + 1]) {
            return false;
        }
        // Recursive call for next index
        return isSorted(arr, index + 1);
    }
}


