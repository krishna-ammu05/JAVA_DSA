package arrays;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();

        // Declare array
        int[] arr = new int[size];

        // Input elements
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Input target to search
        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();

        // Perform Linear Search
        boolean found = false;
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {
                found = true;
                index = i;
                break;
            }
        }

        // Output result
        if (found) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }

        scanner.close();
    }
}


