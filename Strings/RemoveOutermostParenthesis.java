package Strings;

import java.util.Scanner;

public class RemoveOutermostParenthesis {

    public static String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int balance = 0; // keeps track of open parentheses count
        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (balance > 0) {   // not the outermost '('
                    result.append(c);
                }
                balance++;
            } else { // c == ')'
                balance--;
                if (balance > 0) {   // not the outermost ')'
                    result.append(c);
                }
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a valid parentheses string: ");
        String s = sc.nextLine();
        System.out.println("After removing outermost parentheses: " + removeOuterParentheses(s));
        sc.close();
    }
}
