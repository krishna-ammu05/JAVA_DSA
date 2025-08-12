package BackTracking;
import java.util.Scanner;
public class permutationsOfStr {
    

    public static void findPermutation(String str, String ans) {
        // Base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // Recursion
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);

            // Remaining string after removing the current char
            String newStr = str.substring(0, i) + str.substring(i + 1);

            // Recursive call
            findPermutation(newStr, ans + curr);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();
        System.out.println("Permutations of the string:");
        findPermutation(str, "");
    }
}

