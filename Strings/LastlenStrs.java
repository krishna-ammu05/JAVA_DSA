package Strings;
import java.util.Scanner;
public class LastlenStrs {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        sc.close();

        int length = 0;
        int i = input.length() - 1;

        // Step 1: Skip trailing spaces
        while (i >= 0 && input.charAt(i) == ' ') {
            i--;
        }

        // Step 2: Count the length of the last word
        while (i >= 0 && input.charAt(i) != ' ') {
            length++;
            i--;
        }

        System.out.println("Length of last word is: " + length);
    }
}


