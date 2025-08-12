package BackTracking;

 public class BTArrays {

    // Function to print array
    public static void printArr(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Backtracking function
    public static void changeArr(int[] arr, int i, int val) {
        // Base case
        if (i == arr.length) {
            printArr(arr);
            return;
        }

        // Choice step
        arr[i] = val;

        // Recursive call
        changeArr(arr, i + 1, val + 1);

        // Backtracking step
        arr[i] = arr[i] - 2;
    }

    public static void main(String[] args) {
        int n = 4;        // size of array (dynamic)
        int startVal = 1; // starting value (dynamic)
        int[] arr = new int[n];

        changeArr(arr, 0, startVal);
    }
}
 
