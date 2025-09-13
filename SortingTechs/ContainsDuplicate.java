package SortingTechs;
import java.util.Scanner;
import java.util.Arrays;

public class ContainsDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Contains duplicates: " + containsDuplicate(arr));
        sc.close();
    }

    public static boolean containsDuplicate(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) { 
            if (arr[i] == arr[i + 1]) {
                return true;
            }
        }
        return false; // ✅ missing return fixed
    }
}
