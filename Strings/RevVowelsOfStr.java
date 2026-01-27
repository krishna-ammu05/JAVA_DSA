package Strings;

public class RevVowelsOfStr {
    public static void main(String[] args) {
        System.out.println("enter a string to reverse vowels");
        String str = "Americaleetcode";
        System.out.println("Original String"+ " " +str);
        System.out.println(reverseVowels(str)); // Expected: leotcede
    }

    public static String reverseVowels(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }

        String vowels = "aeiouAEIOU";
        char[] arr = s.toCharArray(); // str to array
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            while (i < j && vowels.indexOf(arr[i]) == -1) {
                i++;
            }
            while (i < j && vowels.indexOf(arr[j]) == -1) {
                j--;
            }
            // swap
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return new String(arr);
    }
}

