package Arraylist;
import java.util.ArrayList;
import java.util.Scanner;

public class MultidimArrList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        //input elements row by row
        for(int i =0;i<rows;i++){
            ArrayList<Integer> row = new ArrayList<>();
            System.out.println("Enter the number of elements in row " + (i + 1) + ":");
            int cols = sc.nextInt();
            for(int j = 0; j < cols; j++){
                System.out.println("Enter element " + (j + 1) + ":");
                row.add(sc.nextInt());
            }
            list.add(row);
        }
        // Print the 2D ArrayList
        System.out.println("\n2D ArrayList contents:");
        for (ArrayList<Integer> row : list) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        sc.close();

    }
}
