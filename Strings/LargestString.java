package Strings;
import java.util.Scanner;
public class LargestString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a strings array");
        String arr[] = sc.nextLine().split(" ");
        String largest = arr[0];
        //not by lenth i want largest ny characterin the strings
        for (int i =0;i<arr.length;i++){
            if(arr[i].compareTo(largest)>0){
                largest = arr[i];
            }
        }
        System.out.println("Largest String is :"+largest);
        sc.close();
        }
    }
    

