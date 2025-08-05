package Recursion;

public class FirstOccurence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 6};
        int target = 3;
        int index = findFirstOccurrence(arr, target, 0);
        System.out.println("First occurrence of " + target + " is at index: " + index);
    }

    // Recursive function to find the first occurrence of target in arr
    public static int findFirstOccurrence(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1; // Target not found
        }
        if (arr[index] == target) {
            return index; // Found the first occurrence
        }
        return findFirstOccurrence(arr, target, index + 1); // Recur for next index
    }
    
}
// package Recursion;

// public class FirstOccurrenceString {
//     public static void main(String[] args) {
//         String str = "recursion";
//         char target = 'r';
//         int index = findFirstOccurrence(str, target, 0);
//         System.out.println("First occurrence of '" + target + "' is at index: " + index);
//     }

//     // Recursive function to find the first occurrence of a character in a string
//     public static int findFirstOccurrence(String str, char target, int index) {
//         if (index == str.length()) {
//             return -1; // Target not found
//         }
//         if (str.charAt(index) == target) {
//             return index; // Found the first occurrence
//         }
//         return findFirstOccurrence(str, target, index + 1); // Recur for next index
//     }
// }
