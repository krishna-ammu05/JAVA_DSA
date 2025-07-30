public class StaticNestedClass{
class Outer {
    static int data = 100;

    static class Inner {
        void msg() {
            System.out.println("Data is: " + data);
        }
    }

    public static void main(String[] args) {
        Outer.Inner obj = new Outer.Inner(); // no need of Outer class object
        obj.msg();
    }
}
}