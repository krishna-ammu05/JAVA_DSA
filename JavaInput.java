// import java.util.*;
// public class JavaInput{
//     public static void main (String args[]){
//         Scanner sc = new Scanner(System.in);

//         String input = sc.nextLine(); // Read the whole line
//         System.out.println(input);

//         String name = sc.nextLine();
//         System.out.println(name);

//         int number = sc.nextInt();
//         System.out.println(number);

//         float price = sc.nextFloat();
//         System.out.println(price);
//         sc.close();
//     }
// }

//sum taking inputs from  Scanner
import java.util.*;
 public class JavaInput{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(" Sum is :" + sum);

    }
 }