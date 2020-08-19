package day16_String;

import day12_Switch_Scanner.Switch_Statement;

import java.util.Scanner;

public class replit_middleOne_64 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if(word.length()>=3 && word.length()%2==1) {
            if (word.length() == 3) {
                System.out.println(word.charAt(word.length() - 2));
            } else if (word.length() == 5) {
                System.out.println(word.charAt(word.length() - 3));
            } else if (word.length() == 7) {
                System.out.println(word.charAt(word.length() - 4));
            } else if (word.length() == 9) {
                System.out.println(word.charAt(word.length() - 5));
            }
        }else if (word.length() == 1) {
            System.out.println(word + "" + word + "" + word);
        }else if(word.length()>=4 && word.length()%2==0){
            if (word.length() == 4) {
                System.out.println(word.substring(1,3));
            } else if (word.length() == 6) {
                System.out.println(word.substring(2,4));
            } else if (word.length() == 8) {
                System.out.println(word.substring(3,5));
            } else if (word.length() == 10) {
                System.out.println(word.substring(4,6));
            }
        }else if(word.length()==2){
            System.out.println(word+""+word);
        }




    }
}
