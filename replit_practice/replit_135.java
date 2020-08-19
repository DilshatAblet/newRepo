package replit_practice;

import java.util.Arrays;
import java.util.Scanner;

public class replit_135 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

//        String[] a = sentence.split(" ");
//        for(String each :a){
//            System.out.println(each);
//        }
        String[] a=sentence.split(" ");
        for(int i = a.length-1;i>=0;i--){
            System.out.println(a[i]);
        }

    }
}
