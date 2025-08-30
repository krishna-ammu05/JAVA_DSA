package SortingTechs;

import java.util.Scanner;

public class sqrtBinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int results = mysqrt(n);
        System.out.println(results);
        sc.close();
    }
    public static int mysqrt(int n){
        if(n ==0||n==1){
            return n;
        }
        int low =0,high =n,ans =0;
        while(low <=high){
            int mid = low+(high-low)/2;

            long sq =(long)mid*mid;
            if(sq == n){
                return mid;
            }else if(sq<n){
                ans = mid;
                low = mid +1;
            }else{
                high = mid -1;
            }
        }
        return ans;
    }

}
