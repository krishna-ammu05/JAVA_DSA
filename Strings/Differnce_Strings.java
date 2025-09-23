package Strings;

public class Differnce_Strings {
    public static void main(String[] args) {
        String s1 ="abcd";
        String s2 ="abcde";
        System.out.println("String s1=" +s1);
        System.out.println("String s2=" +s2);
        System.out.println(DifferenceASCII(s1,s2));
        System.out.println(Difference(s1,s2));

}

    public static char Difference(String s,String t){
        int result =0;
        for(int i=0;i<s.length();i++){
            result^=s.charAt(i);
        }
        for(int j=0;j<t.length();j++){
            result^=t.charAt(j);
        }
        return (char)result;
    }
    public static char DifferenceASCII(String s, String t) {
        int sumS = 0, sumT = 0;
        
        for (char ch : s.toCharArray()) {
            sumS += ch;
        }
        for (char ch : t.toCharArray()) {
            sumT += ch;
        }
        
        return (char) (sumT - sumS);
    }
}
