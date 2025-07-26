package Strings;
import java.util.Scanner;
public class ShortestPath {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input direction string
        System.out.print("Enter direction string (N, S, E, W): ");
        String directions = sc.nextLine().toUpperCase();

        // Function call
        double shortest = getShortestPath(directions);

        System.out.println("Shortest path from origin: " + shortest);

        sc.close();
    }

    // Function to calculate shortest path
    public static double getShortestPath(String path) {
        int x = 0, y = 0;

        for (char dir : path.toCharArray()) {
            if (dir == 'N') {
                y++;
            } else if (dir == 'S') {
                y--;
            } else if (dir == 'E') {
                x++;
            } else if (dir == 'W') {
                x--;
            } else {
                System.out.println("Invalid direction: " + dir);
            }
        }

        // Return the shortest displacement from origin
        return Math.sqrt(x * x + y * y);
    }
}


