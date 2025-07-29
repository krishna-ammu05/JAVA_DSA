package BitManipulation;

public class FastExponention {
    

    public static int power(int base, int exponent) {
        int result = 1;

        while (exponent > 0) {
            // If the least significant bit is 1, multiply result
            if ((exponent & 1) == 1) {
                result *= base;
            }

            // Square the base
            base *= base;

            // Right shift exponent by 1 (divide by 2)
            exponent >>= 1;
        }

        return result;
    }

    public static void main(String[] args) {
        int base = 2;
        int exponent = 10;
        int result = power(base, exponent);
        System.out.println(base + "^" + exponent + " = " + result);
    }
}


