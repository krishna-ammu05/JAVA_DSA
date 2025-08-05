package Recursion;
import java.util.Scanner;

public class RemoveDuplicateStrs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        sc.close();

        // Convert string to lowercase if needed
        str = str.toLowerCase(); // To safely use map for 'a' to 'z'

        String result = removeDuplicates(str, 0, "", new boolean[26]);
        System.out.println("String after removing duplicates: " + result);
    }

    public static String removeDuplicates(String str, int index, String newStr, boolean[] map) {
        // Base case: if index reaches end of string
        if (index == str.length()) {
            return newStr;
        }

        char currentChar = str.charAt(index);

        if (map[currentChar - 'a']) {//gives the index c-a = 2
            // Already seen this character, skip it
            return removeDuplicates(str, index + 1, newStr, map);
        } else {
            // Not seen, add to result and mark as seen
            map[currentChar - 'a'] = true;
            return removeDuplicates(str, index + 1, newStr + currentChar, map);
        }
    }
}
