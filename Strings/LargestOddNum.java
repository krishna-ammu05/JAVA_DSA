package Strings;

import java.util.Scanner;

public class LargestOddNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a numeric string: ");
        String num = sc.nextLine();
        System.out.println("Largest odd number substring: " + largestOddNumber(num));
        sc.close();
    }

    public static String largestOddNumber(String s) {
    for (int i = s.length() - 1; i >= 0; i--) {
        char ch = s.charAt(i);
        System.out.println("Checking index " + i + " char=" + ch);
        if ((ch - '0') % 2 == 1) {
            System.out.println("Found odd at index " + i);
            return s.substring(0, i + 1);
        }
    }
    System.out.println("No odd digit found");
    return "";
}
    }

