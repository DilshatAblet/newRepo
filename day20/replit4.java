package day20;
import java.util.Scanner;
public class replit4 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below
        int length = word.length()-1;
        for(int i = 0; i <=length;i++){
            System.out.println(word.charAt(i));
        }
    }
}
