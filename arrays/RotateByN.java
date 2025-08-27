package arrays;

import java.util.Scanner;
import java.util.Arrays;

public class RotateByN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size:");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter n places to rotate:");
        int n = sc.nextInt();

        int[] results = rotateLeft(arr, n);
        System.out.println("Rotated Array: " + Arrays.toString(results));
    }

    // Function to rotate array to the left by n positions
    public static int[] rotateLeft(int[] arr, int n) {
        int len = arr.length;
        n = n % len; // to handle cases when n > len
        int[] result = new int[len];

        for (int i = 0; i < len; i++) {
            result[i] = arr[(i + n) % len];
        }

        return result;
    }
}
