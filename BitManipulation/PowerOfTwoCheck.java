public class PowerOfTwoCheck {
    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
    public static void main(String[] args) {
        int[] testNumbers = {8, 5, 1, 16, 0, -8};

        for (int num : testNumbers) {
            System.out.println(num + " -> " + isPowerOfTwo(num));
        }
    }
}
