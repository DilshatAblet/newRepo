package day27_recap;

import java.util.Scanner;
import java.util.Arrays;
public class replit_vowels {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();

        String vowels = "";

        for(int i =0;i<=word.length()-1;i++){
            char ch = word.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='u'||ch=='o'){
                vowels+=ch;
            }

        }
        System.out.println(vowels);







    }
}
