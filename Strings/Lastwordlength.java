package Strings;
import java.util.Scanner;
public class Lastwordlength{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string array");
        String str[] = sc.nextLine().split("");
        sc.close();
        int lastWordLength = 0;
        for(int i =str.length-1;i>=0;i++){
            if (str[i].equals(" ")){
                if(lastWordLength > 0) {
                    break; // Stop when we find the first space after counting the last word
                }
            } else {
                lastWordLength++;
            }
        }
        System.out.println("Length of last word is: " + lastWordLength);
        
        }
    }
