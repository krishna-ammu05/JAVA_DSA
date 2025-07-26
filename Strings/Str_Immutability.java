package Strings;

public class Str_Immutability {
    
    public static void main(String[] args) {

        // Create a string
        String str = "Java";
        System.out.println("Original String: " + str);

        // Try to modify it using concat
        str.concat(" Programming");

        // Print after concat
        System.out.println("After concat (without assignment): " + str);

        // Now assign the result to str
        str = str.concat(" Programming");

        // Print again
        System.out.println("After concat (with assignment): " + str);
    }
}



