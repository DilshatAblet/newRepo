package day25_practices;

import java.util.Scanner;

public class relit_1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();

        int wordlength = word.length();
        int charcount = 3;
        for(int i=0;i<=word.length()-charcount;i++) {

            String currentword = word.substring(i,i+charcount);


            if (currentword.equalsIgnoreCase("cat")) {
                countOfCats++;
            }
            else if (currentword.equalsIgnoreCase("Dog")) {
                countOfDogs++;
            }
        }
        boolean results = countOfCats==countOfDogs;
        System.out.println(results);





    }
}
