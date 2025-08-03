package Recursion;

public class LastOccurence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 6};
        int target = 3;
        int index = findLastOccurrence(arr, target, arr.length - 1);
        System.out.println("Last occurrence of " + target + " is at index: " + index);
    }

    // Recursive function to find the last occurrence of target in arr
    public static int findLastOccurrence(int[] arr, int target, int index) {
        if (index < 0) {
            return -1; // Target not found
        }
        if (arr[index] == target) {
            return index; // Found the last occurrence
        }
        return findLastOccurrence(arr, target, index - 1); // Recur for previous index
    }
    
}
