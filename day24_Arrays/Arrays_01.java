package day24_Arrays;

import java.util.Scanner;

public class Arrays_01 {
    public static void main(String[] args) {

        String str = "aabcc";
        String Unique = "";


        for(int i = 0; i<=str.length()-1;i++){
            char ch = str.charAt(i);
            int first = str.indexOf(ch);
            int last =str.lastIndexOf(ch);
            if(first == last){
                Unique+=ch;
            }
        }







    }
}
