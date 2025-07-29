package BitManipulation;

public class UpdateithBit {

    public static void main(String[] args) {
        System.out.println("Update the i-th bit of a number based on the new bit value.");
        int n = 10;     // Binary: 1010
        int i = 2;      // Index to update (0-based from right)
        int newBit = 1; // New bit value to set at position i
        System.out.println("Before: " + Integer.toBinaryString(n));
        int updated = updateIthBit(n, i, newBit);
        System.out.println("After:  " + Integer.toBinaryString(updated));
        System.out.println("Updated Number: " + updated);
    }

    public static int updateIthBit(int n, int i, int newBit) {
        if (newBit == 0) {
            return clearIthBit(n, i);
        } else {
            return setIthBit(n, i);
        }
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }
}
