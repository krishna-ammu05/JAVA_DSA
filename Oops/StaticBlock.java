class StaticBlock {
    static int count;

    // Static block
    static {
        count = 10;
        System.out.println("Static block called, count = " + count);
    }

    public static void main(String[] args) {
        System.out.println("Main method executed.");
    }
}
