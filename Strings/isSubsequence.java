package Strings;
import java.util.Scanner;
public class isSubsequence {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the target string:");
        String target = sc.nextLine();
        System.out.println("enter the substring");
        String substr = sc.nextLine();
        boolean results = isSubsequence(target,substr);
        System.out.println("isSubsequence"+"  " +results);
        sc.close();
       

    }
    public static boolean isSubsequence(String target, String substr){
        int i =0;
        int j =0;
        while(i<target.length() && j<substr.length()){
            if(target.charAt(i) == substr.charAt(j)){
                j++;
            }
           i++; 
        }
        return j == substr.length();
        // return true;
    }
}
