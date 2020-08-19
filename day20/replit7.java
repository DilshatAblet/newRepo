package day20;
import java.util.Scanner;
public class replit7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        char firstx = word.charAt(0);
        char secondx = word.charAt(word.length()-1);
        char x= 'x';
        char X ='X';
        boolean check = firstx==x||firstx==X ;
        boolean check2 =secondx==X||secondx==x;
        if(check){
            System.out.println(word.replaceFirst("x","")+word.replace("X",""));
        }else if(check2){
            System.out.println(word.replace("x","")+word.replace("X",""));
        }else{
            System.out.println(word);
        }







    }
}
