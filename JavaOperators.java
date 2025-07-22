public class JavaOperators{
    public static void main(String args[]){
        int a =10;
        int b =15;
        // Arithmetic Operators(Binary Operators)
        int sum = a + b;
        int diff = a - b;
        int prod = a * b;
        int div = a / b;
        int mod = a % b;
        System.out.println("Sum:" + sum);
        System.out.println("diff:" + diff);
        System.out.println("prod:" + prod);
        System.out.println("div:" + div);
        System.out.println("mod:" + mod);

        //Arithmetic Operators(Unary Operators)
        int x = a++;
        int y = ++b;
        int z = --a;
        int w = b--;
        System.out.println("x Post Increment(a++): " + x);
        System.out.println("y Pre Increment(++b): " + y);
        System.out.println("z Pre Decrement(--a): " + z);
        System.out.println("w Post Decrement(b--): " + w);

        // Relational Operators
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        // Logical Operators
        System.out.println("a > 5 && b < 20: " + (a > 5 && b < 20));
        System.out.println("a < 5 || b < 20: " + (a < 5 || b < 20));
        System.out.println("!(a < b): " + !(a < b));

        // Bitwise Operators
        System.out.println("a & b: " + (a & b));
        System.out.println("a | b: " + (a | b));
        System.out.println("a ^ b: " + (a ^ b));
        System.out.println("~a: " + (~a));
        System.out.println("a << 2: " + (a << 2));
        System.out.println("a >> 2: " + (a >> 2));
        System.out.println("a >>> 2: " + (a >>> 2));

        // Assignment Operators
        System.out.println("a = b: " + (a = b));
        System.out.println("a += b: " + (a += b));
        System.out.println("a -= b: " + (a -= b));
        System.out.println("a *= b: " + (a *= b));
        System.out.println("a /= b: " + (a /= b));
        System.out.println("a %= b: " + (a %= b));
        System.out.println("a &= b: " + (a &= b));
        System.out.println("a |= b: " + (a |= b));
        System.out.println("a ^= b: " + (a ^= b));
        System.out.println("a <<= 2: " + (a <<= 2));
        
    }
}