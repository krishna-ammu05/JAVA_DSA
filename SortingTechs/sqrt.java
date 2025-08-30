package SortingTechs;

import java.util.Scanner;

public class sqrt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int results = mysqrt(n);
        System.out.println(results);
        sc.close();

    }
    public static int mysqrt(int n){
        int i=1;
        while(i*i <=n){
            i++;
        }
        return i-1;
    }
}
