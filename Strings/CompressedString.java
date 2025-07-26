package Strings;
import java.util.Scanner;
public class CompressedString {
    

    // Function to compress the string
    public static String compressString(String str) {
        if (str == null || str.length() == 0) return "";

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i - 1)).append(count);
                count = 1;
            }
        }

        // Append the last character and count
        compressed.append(str.charAt(str.length() - 1)).append(count);

        return compressed.toString();
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string to compress: ");
        String str = sc.nextLine();
        sc.close();
    
        String result = compressString(str);
        System.out.println("Compressed string: " + result);
    }
}


