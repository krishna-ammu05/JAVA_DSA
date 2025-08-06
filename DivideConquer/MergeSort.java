package DivideConquer;
import java.util.Scanner;
public class MergeSort {
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
        Mergesort(arr, 0, n-1);
        System.out.println("Sorted array:");
        printArray(arr);

    }
    public static void Mergesort(int arr[],int start,int end){
        if(start>=end){
            return;
        }
        if (start <end){
            int mid = (start +end)/2;
            Mergesort(arr, start, mid);
            Mergesort(arr, mid + 1, end);
            merge(arr, start, mid, end);

        }
    }
    public static void merge(int arr[],int start,int mid,int end){
        int temp[] = new int[end -start+1];
        int i = start,j= mid+1,k=0;
        while(i <= mid && j<=end){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }  
        //left part
        while(i <= mid){
            temp[k++] = arr[i++];
        }
        //right part
        while(j <= end){
            temp[k++] = arr[j++];
        }
        //copying ele
        for(k =0,i=start;k<temp.length;k++,i++){
            arr[i] = temp[k];
        }
}
public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}