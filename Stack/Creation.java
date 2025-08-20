package Stack;

import java.util.Scanner;

public class Creation {
    private int[] stack;
    private int top;

    // constructor
    public Creation(int size) {
        stack = new int[size];
        top = -1;
    }

    // push method (dynamic resizing)
    public void push(int value) {
        if (isFull()) {
            // double the size
            int[] newStack = new int[stack.length * 2];
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            stack = newStack;
            System.out.println("Stack size increased to " + stack.length);
        }
        stack[++top] = value;
    }

    // pop method
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

    // peek method
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

    // check empty
    public boolean isEmpty() {
        return top == -1;
    }

    // check full
    public boolean isFull() {
        return top == stack.length - 1;
    }

    // print stack
    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter initial size of the stack: ");
        int n = sc.nextInt();

        Creation stack = new Creation(n);

        while (true) {
            System.out.println("\n1. Push\n2. Pop\n3. Peek\n4. Print\n5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int val = sc.nextInt();
                    stack.push(val);
                    break;
                case 2:
                    System.out.println("Popped: " + stack.pop());
                    break;
                case 3:
                    System.out.println("Top element: " + stack.peek());
                    break;
                case 4:
                    stack.printStack();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
