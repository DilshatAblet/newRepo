package day22_Nested_Loop;

import java.util.Scanner;

public class replit_XX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String a =""+word.charAt(0);
        String b = ""+word.charAt(word.length()-1);
        if(a.equalsIgnoreCase("x")&&b.equalsIgnoreCase("x")){
            System.out.println(word.substring(1,word.length()-1));
        }else if(a.equalsIgnoreCase("x")){
            System.out.println(word.substring(1));
        }else if(b.equalsIgnoreCase("x")){
            System.out.println(word.substring(0,word.length()-1));
        }else{
            System.out.println(word);
        }


    }
}
