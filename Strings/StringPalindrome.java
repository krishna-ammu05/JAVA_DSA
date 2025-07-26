package Strings;
import java.util.Scanner;
public class StringPalindrome {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Dynamic input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Function call
        if (isPalindrome(input)) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        }

        sc.close();
    }

    // Function to check palindrome
    public static boolean isPalindrome(String str) {
        // Optional: remove spaces and make lowercase
        str = str.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}


