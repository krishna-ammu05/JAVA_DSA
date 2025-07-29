public class AccessModifiers {

    // --- Access Modifier Examples ---

    private void privateMethod() {
        System.out.println("Private Method: Accessible only within this class");
    }

    void defaultMethod() {
        System.out.println("Default Method: Accessible within the same package");
    }

    protected void protectedMethod() {
        System.out.println("Protected Method: Accessible within package and subclasses");
    }

    public void publicMethod() {
        System.out.println("Public Method: Accessible from anywhere");
    }

    // Method to show access from same class
    public void accessWithinClass() {
        System.out.println("---- Access from Same Class ----");
        privateMethod();     // ✅
        defaultMethod();     // ✅
        protectedMethod();   // ✅
        publicMethod();      // ✅
    }

    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        obj.accessWithinClass();

        System.out.println("\n---- Access from Another Class (Same File) ----");
        AnotherClass tester = new AnotherClass();
        tester.testAccess();
    }
}

// Another class in the same file (same package)
class AnotherClass {
    public void testAccess() {
        AccessModifiers obj = new AccessModifiers();

        // obj.privateMethod(); ❌ Not allowed
        // obj.privateMethod(); // Uncommenting will cause compile-time error

        obj.defaultMethod();     // ✅
        obj.protectedMethod();   // ✅
        obj.publicMethod();      // ✅
    }
}
