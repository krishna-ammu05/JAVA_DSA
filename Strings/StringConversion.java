package Strings;

public class StringConversion {
    
    public static void main(String[] args) {

        //  String to int
        String strInt = "100";
        int num = Integer.parseInt(strInt);
        System.out.println("String to int: " + num + " + 10 = " + (num + 10));

        //  String to long
        String strLong = "123456789";
        long longVal = Long.parseLong(strLong);
        System.out.println("String to long: " + longVal);

        //  String to double
        String strDouble = "45.67";
        double d = Double.parseDouble(strDouble);
        System.out.println("String to double: " + d);

        //  String to float
        String strFloat = "3.14";
        float f = Float.parseFloat(strFloat);
        System.out.println("String to float: " + f);

        //  String to boolean
        String strBool = "true";
        boolean b = Boolean.parseBoolean(strBool);
        System.out.println("String to boolean: " + b);

        //  String to char (only first character)
        String strChar = "A";
        char ch = strChar.charAt(0);
        System.out.println("String to char: " + ch);

        //  int to String
        int number = 123;
        String strFromInt1 = Integer.toString(number);
        String strFromInt2 = String.valueOf(number);
        System.out.println("int to String: " + strFromInt1 + ", " + strFromInt2);

        //  double to String
        double d1 = 45.67;
        String strFromDouble = String.valueOf(d1);
        System.out.println("double to String: " + strFromDouble);

        //  float to String
        float f1 = 3.14f;
        String strFromFloat = String.valueOf(f1);
        System.out.println("float to String: " + strFromFloat);

        //  long to String
        long l = 987654321L;
        String strFromLong = String.valueOf(l);
        System.out.println("long to String: " + strFromLong);

        //  boolean to String
        boolean flag = true;
        String strFromBool = String.valueOf(flag);
        System.out.println("boolean to String: " + strFromBool);

        //  char to String
        char c = 'A';
        String strFromChar = String.valueOf(c);
        System.out.println("char to String: " + strFromChar);
    }
}

    


