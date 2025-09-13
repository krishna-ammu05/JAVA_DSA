package SortingTechs;
import java.util.Scanner;
import java.util.Arrays;
public class Valid_Anagram {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter first string:");
        String s1=sc.nextLine();
        System.out.println("Enter second string:");
        String s2=sc.nextLine();
        System.out.println(isAnagram(s1,s2));
        sc.close();
    }
    public static boolean isAnagram(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        char[] arr1 = s1.toCharArray();
        char[] arr2=s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
    }
}


