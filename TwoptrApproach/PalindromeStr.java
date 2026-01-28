package TwoptrApproach;
import java.util.Scanner;
public class PalindromeStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a string");
        String str = sc.nextLine();
        sc.close();
        if(isPalindrome(str)){
            System.out.println("The string is a Palindrome:");
        }else{
            System.out.println("The string is not a Palindrome:");
        }
        
    }
    public static boolean isPalindrome(String str){
        int left =0;
        int right = str.length() -1;
        while(left< right){
            if(str.charAt(left)!= str.charAt(right)){
                return false;
            }
            left++;
            right--;    
        }
        return true;
    }
}
