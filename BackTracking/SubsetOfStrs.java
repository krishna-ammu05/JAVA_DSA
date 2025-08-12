package BackTracking;
import java.util.Scanner;
public class SubsetOfStrs {

    public static void findSubsets(String str, int i, String ans) {
        // Base case: reached end of string
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null"); // Empty subset
            } else {
                System.out.println(ans);
            }
            return;
        }

        // Recursive case:
        // 1. Exclude current character
        findSubsets(str, i + 1, ans);

        // 2. Include current character
        findSubsets(str, i + 1, ans + str.charAt(i));
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();
        System.out.println("Subsets of the string:");
        findSubsets(str, 0, "");
    }
}
