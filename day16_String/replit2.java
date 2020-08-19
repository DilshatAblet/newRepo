package day16_String;
import java.util.Scanner;
public class replit2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        if(word.length()==4){
            System.out.println(word.replace(word.substring(2,4),word.substring(0,2)));
        }else if(word.length()==5) {
            System.out.println(word.replace(word.substring(2), word.substring(0, 2)));
        }else if(word.length()==6){
            System.out.println(word.replace(word.substring(3,6),word.substring(0,3)));
        }else if(word.length()==8){
            System.out.println(word.replace(word.substring(4,8),word.substring(0,4)));
        }else if(word.length()==9){
            System.out.println(word.replace(word.substring(4,9),word.substring(0,4)));
        }else{
            System.out.println(word.replace(word.substring(5,10),word.substring(0,5)));
        }




    }
}
