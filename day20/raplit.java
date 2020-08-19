package day20;
import java.util.Scanner;
public class raplit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        if(word.length()%2!=0 && word.length()>=5){
            if(word.length()==5){
                System.out.println(word.substring(1,4));
            }else if(word.length()==7){
                System.out.println(word.substring(2,5));
            }else if(word.length()==9){
                System.out.println(word.substring(3,6));
            }else if(word.length()==11){
                System.out.println(word.substring(4,7));
            }

        }else{
            System.out.println("invalid");
        }

    }
}
