package arrays;
import java.util.Scanner;
public class MoveZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array:");
        for(int i =0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        moveZeros(arr);
        System.out.println("Array after moving zeros to the end:");
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();

    }
    public static void moveZeros(int[] arr){
        int n = arr.length;
        int count =0;
        for(int i =0;i<n;i++){
            if( arr[i]!=0){
                arr[count]= arr[i];
                count++;
            }
        }
        while(count<n){
            arr[count]=0;
            count++;
        }

        
        
    }
}
