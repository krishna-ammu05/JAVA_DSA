public class JavaConditionalStmts {
    public static void main(String args[]) {
        int a = 10;
        int b = 15;
        // Conditional Statements
        if (a > b) {
            System.out.println("a is greater than b");
        } else if (a < b) {
            System.out.println("a is less than b");
        } else {
            System.out.println("a is equal to b");
        }

        // Ternary Operator
        String result = (a > b) ? "a is greater" : "b is greater or equal";
        System.out.println("Ternary Result: " + result);

        // Switch Statement
        switch (a) {
            case 10:
                System.out.println("a is 10");
                break;
            case 15:
                System.out.println("a is 15");
                break;
            default:
                System.out.println("a is neither 10 nor 15");
                break;
        }
    }
    
}
