package day22_Nested_Loop;

import java.util.Scanner;

public class loop_vowel {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        word = word.replace("b", "");
        word = word.replace("c", "");
        word = word.replace("d", "");
        word = word.replace("f", "");
        word = word.replace("g", "");
        word = word.replace("h", "");
        word = word.replace("j", "");
        word = word.replace("k", "");
        word = word.replace("l", "");
        word = word.replace("m", "");
        word = word.replace("n", "");
        word = word.replace("p", "");
        word = word.replace("q", "");
        word = word.replace("r", "");
        word = word.replace("s", "");
        word = word.replace("t", "");
        word = word.replace("v", "");
        word = word.replace("w", "");
        word = word.replace("x", "");
        word = word.replace("y", "");
        word = word.replace("z", "");
        for (int i = 0; i <= word.length()- 1; i++) {
            char a = word.charAt(i);
            System.out.print("" + a);


        }
    }
}