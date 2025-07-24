package arrays;
import java.util.Scanner;
public class LargestNum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // Input size of array
        System.out.print("Enter the number of elements: ");
        int size = sc.nextInt();
        // sc.close();
        // Declare array
        int[] arr = new int[size];

        // Input elements
        System.out.println("Enter " + size + " elements:");
        for ( int i =0;i <size; i++){
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        // Find the largest element
        int largest = arr[0];
        for(int i= 1;i <size;i++){
            if(arr[i] >largest){
                largest = arr[i];

            }
        }
        System.out.println("The largest element in the array is: " + largest);
        sc.close();
    }
}
