package arrays;
import java.util.Scanner;



    
//     public static void main(String[] args) {
//         // Declare and create an array of 5 integers
//         int[] numbers = new int[5];

//         // Assign values
//         numbers[0] = 10;
//         numbers[1] = 20;
//         numbers[2] = 30;
//         numbers[3] = 40;
//         numbers[4] = 50;

//         // Print the array elements
//         System.out.println("Array elements:");
//         for (int i = 0; i < numbers.length; i++) {
//             System.out.println("Element at index " + i + ": " + numbers[i]);
//         }
//     }
// }


import java.util.Scanner;

public class creation {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for array size
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();

        // Declare and create an integer array of given size
        int[] numbers = new int[size];

        // Input elements into the array
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Display the array elements
        System.out.println("\nArray elements are:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }

        scanner.close();
    }
}
