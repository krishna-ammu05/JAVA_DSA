package Strings;
import java.util.Scanner;
public class StringFunctions {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get dynamic string input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("\n--- String Function Results ---");
        printLength(input);
        printCharAt(input);
        printSubstring(input);
        checkEquals(input);
        checkIgnoreCase(input);
        compareStrings(input);
        checkContains(input);
        checkStartEnd(input);
        convertCases(input);
        trimSpaces(input);
        replaceChar(input);
        findIndex(input);
        splitString(input);
        checkEmptyBlank(input);
        convertToCharArray(input);

        sc.close();
    }

    public static void printLength(String str) {
        System.out.println("Length: " + str.length());
    }

    public static void printCharAt(String str) {
        if (str.length() > 2)
            System.out.println("Character at index 2: " + str.charAt(2));
    }

    public static void printSubstring(String str) {
        if (str.length() >= 5)
            System.out.println("Substring (0, 5): " + str.substring(0, 5));
    }

    public static void checkEquals(String str) {
        System.out.println("Equals 'hello': " + str.equals("hello"));
    }

    public static void checkIgnoreCase(String str) {
        System.out.println("EqualsIgnoreCase 'HELLO': " + str.equalsIgnoreCase("HELLO"));
    }

    public static void compareStrings(String str) {
        System.out.println("compareTo 'java': " + str.compareTo("java"));
    }

    public static void checkContains(String str) {
        System.out.println("Contains 'a': " + str.contains("a"));
    }

    public static void checkStartEnd(String str) {
        System.out.println("Starts with 'H': " + str.startsWith("H"));
        System.out.println("Ends with 'd': " + str.endsWith("d"));
    }

    public static void convertCases(String str) {
        System.out.println("To Uppercase: " + str.toUpperCase());
        System.out.println("To Lowercase: " + str.toLowerCase());
    }

    public static void trimSpaces(String str) {
        System.out.println("Trimmed: '" + str.trim() + "'");
    }

    public static void replaceChar(String str) {
        System.out.println("Replace 'a' with 'o': " + str.replace('a', 'o'));
    }

    public static void findIndex(String str) {
        System.out.println("Index of 'a': " + str.indexOf('a'));
        System.out.println("Last Index of 'a': " + str.lastIndexOf('a'));
    }

    public static void splitString(String str) {
        System.out.println("Splitting by space:");
        String[] parts = str.split(" ");
        for (String part : parts) {
            System.out.println("- " + part);
        }
    }

    public static void checkEmptyBlank(String str) {
        System.out.println("Is Empty: " + str.isEmpty());
        System.out.println("Is Blank: " + str.isBlank());  // Java 11+
    }

    public static void convertToCharArray(String str) {
        System.out.println("Characters:");
        char[] chars = str.toCharArray();
        for (char c : chars) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}


