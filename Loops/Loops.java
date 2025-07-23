package Loops;
public class Loops{
    public static void main(String[] args) {
        // For Loop
        for (int i = 0; i < 5; i++) {
            System.out.println("For Loop Iteration: " + i);
        }

        // While Loop
        int j = 0;
        while (j < 5) {
            System.out.println("While Loop Iteration: " + j);
            j++;
        }

        // Do-While Loop
        int k = 0;
        do {
            System.out.println("Do-While Loop Iteration: " + k);
            k++;
        } while (k < 5);
    }
}