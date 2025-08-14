// package Arraylist;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PairSumHashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter no. of elements:");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        System.out.println("Enter the target sum:");
        int target = sc.nextInt();

        ArrayList<int[]> hashingPairs = pairSumHashing(arr, target);
        System.out.println("Pairs with the target sum:");
        printPairs(hashingPairs);

        sc.close();
    }

    // Print pairs
    public static void printPairs(ArrayList<int[]> pairs) {
        if (pairs.isEmpty()) {
            System.out.println("No pairs found");
        } else {
            for (int[] pair : pairs) {
                System.out.println("Pair: " + pair[0] + ", " + pair[1]);
            }
        }
    }

    // Hashing Method
    public static ArrayList<int[]> pairSumHashing(ArrayList<Integer> arr, int target) {
        ArrayList<int[]> pairs = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();

        for (int num : arr) {
            int complement = target - num;
            if (seen.contains(complement)) {
                pairs.add(new int[]{complement, num});
            }
            seen.add(num); // Mark current number as seen
        }

        return pairs;
    }
}
