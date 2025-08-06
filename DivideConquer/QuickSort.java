package DivideConquer;
import java.util.Scanner;
public class QuickSort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        Quicksort(arr, 0, n-1);
        System.out.println("Sorted array:");
        printArray(arr);
    }

    public static void Quicksort(int arr[],int start,int end){
        if(start >= end){
            return;
        }
            int pivotIndex = partition(arr, start, end);
            Quicksort(arr, start, pivotIndex - 1); // Sort left part
            Quicksort(arr, pivotIndex + 1, end); // Sort right part
        
    }

    public static int partition(int arr[],int start,int end){
        int pivot = arr[end];
        int i = start-1;
        for(int j = start; j < end; j++){
            if(arr[j] <= pivot){
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[end] = arr[i];
        arr[i] = temp;
        return i; // Return the index of the pivot

        
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(); // For better readability
    }
}
