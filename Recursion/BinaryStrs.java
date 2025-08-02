package Recursion;

public class BinaryStrs {
    public static void main(String[] args) {
        int n = 3; // length of binary strings
        printBinaryStrings(n, "", '0');
    }

    // prev stores the previous character in the string
    public static void printBinaryStrings(int n, String str, char prev) {
        if (n == 0) {
            System.out.println(str);
            return;
        }

        // Always allowed to add '0'
        printBinaryStrings(n - 1, str + "0", '0');

        // Add '1' only if previous was not '1'
        if (prev != '1') {
            printBinaryStrings(n - 1, str + "1", '1');
        }
    }
}


