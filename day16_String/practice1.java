package day16_String;
import java.util.Scanner;
public class practice1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE:
        char lastletter = word.charAt(word.length()-1) ;
        System.out.println(lastletter);
    }
}
