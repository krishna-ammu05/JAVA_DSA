package BackTracking;
import java.util.Scanner;
public class GridWays {

    static int N; // Number of rows
    static int M; // Number of columns

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter grid Rows(n):");
        int n = sc.nextInt();
        System.out.println("Enter grid Columns(m):");
        int m = sc.nextInt();
        sc.close();

        countWays(0,0,n,m);
        System.out.println("Total ways:"+ totalWays);

    }
    static int totalWays = 0;
    static void countWays(int i,int j, int n,int m){
        //out of bounds
        if(i>=n || j>=m) return;
        //Reached destination
        if(i==n-1 && j==m -1){
            totalWays++;
            return;
        }
        //Move down
        countWays(i+1,j,n,m);
        //Move right
        countWays(i,j+1,n,m);
    }
}
