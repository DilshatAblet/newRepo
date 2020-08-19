package day25_practices;

import java.util.Scanner;

public class replit_string_loops {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String word = scan.next();

        int count = 0;
        int wordlength = word.length();
        int charcount = 4;
        for(int i=0;i<=word.length()-charcount;i++) {

            String currentword = word.substring(i, i + charcount);
            if (currentword.equalsIgnoreCase("java")) {
                count++;
            }
        }
            System.out.println(count);
    }
}
