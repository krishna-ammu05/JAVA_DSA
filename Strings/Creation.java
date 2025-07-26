package Strings;

public class Creation {
    public static void main(String[] args) {

        // 1. String using literal (recommended)
        String s1 = "Hello";
        System.out.println("String using literal: " + s1);

        // 2. String using new keyword (creates new object in heap)
        String s2 = new String("World");
        System.out.println("String using new keyword: " + s2);

        // 3. Empty String
        String empty = "";
        System.out.println("Empty String: '" + empty + "'");

        // 4. String from character array
        char[] letters = {'J', 'A', 'V', 'A'};
        String s3 = new String(letters);
        System.out.println("String from char array: " + s3);

        // 5. String from byte array (ASCII values)
        byte[] ascii = {72, 101, 108, 108, 111}; // H, e, l, l, o
        String s4 = new String(ascii);
        System.out.println("String from byte array: " + s4);

        // 6. Using StringBuilder or StringBuffer
        StringBuilder sb = new StringBuilder("String");
        sb.append(" Builder");
        String s5 = sb.toString();
        System.out.println("String using StringBuilder: " + s5);
    }
}
 
