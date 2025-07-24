package TypeConversion;
public class TypeConversion {
    public static void main(String[] args) {
        // Example of implicit type conversion
        int intValue = 100;
        double doubleValue = intValue; // int to double
        System.out.println("Implicit conversion from int to double: " + doubleValue);

        // Example of explicit type conversion (casting)
        double anotherDoubleValue = 9.78;
        int anotherIntValue = (int) anotherDoubleValue; // double to int
        System.out.println("Explicit conversion from double to int: " + anotherIntValue);

        // Example of converting String to int
        String strNumber = "123";
        int parsedInt = Integer.parseInt(strNumber);
        System.out.println("Converted String to int: " + parsedInt);
// Example of converting int to String
        int number = 456;
        String strNumberFromInt = Integer.toString(number);
        System.out.println("Converted int to String: " + strNumberFromInt);

        // Example of converting String to double
        String strDouble = "45.67";
        double parsedDouble = Double.parseDouble(strDouble);
        System.out.println("Converted String to double: " + parsedDouble);

        // Example of converting double to String
        double anotherDouble = 89.12;
        String strFromDouble = Double.toString(anotherDouble);
        System.out.println("Converted double to String: " + strFromDouble);
    }
} 



//byte-> Short -> int -> long -> float -> double
//large or compatable data typs
