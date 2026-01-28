package TwoptrApproach;
import java.util.Scanner;
public class Reversearr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of an array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter elements of an array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        reversearr(arr);
        System.out.println("reversed array is:");
        for(int i =0;i<n;i++){
            System.out.print(arr[i] + " ");
        }

    }
    public static void reversearr(int arr[]){
        int left =0;
        int right = arr.length -1;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
    }
}
}
