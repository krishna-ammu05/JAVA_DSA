package Strings;
import java.util.Scanner;
public class larrgestString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a strings array:");
        String arr[] = sc.nextLine().split(" ");

        String largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (isGreater(arr[i], largest)) {
                largest = arr[i];
            }
        }
        System.out.println("Largest String is: " + largest);
        sc.close();
    }
    public static boolean isGreater(String a, String b) {
        int len = Math.min(a.length(), b.length());
        for (int i = 0; i < len; i++) {
            if (a.charAt(i) > b.charAt(i)) {
                return true;
            } else if (a.charAt(i) < b.charAt(i)) {
                return false;
            }
        }
        // If all characters are same till min length, then longer string is considered greater
        return a.length() > b.length();
    }
}


