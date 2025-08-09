public class DecimalToBinary {

    public static void decimalToBinary(int n) {
        if (n == 0) {
            return;
        }
        decimalToBinary(n / 2);
        System.out.print(n % 2);
    }

    public static void main(String[] args) {
        int number = 13;
        if (number == 0) {
            System.out.print(0); 
        } else {
            decimalToBinary(number);
        }
        System.out.println();
    }
}
