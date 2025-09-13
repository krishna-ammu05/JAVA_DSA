package Strings;
import java.util.Scanner;

public class RevString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Reversed string: " + reverseString(str));
        sc.close();
    }

    public static String reverseString(String str) {
        char[] s = str.toCharArray(); // convert to char array
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            // swap characters
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            // move pointers
            left++;
            right--;
        }

        return new String(s); // build back string from char array
    }
}
