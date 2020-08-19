package day15_String;

import java.util.SplittableRandom;

public class SubString_method {
    public static void main(String[] args) {

        String sentence = "java is fun";
                         //012345678910
        String word = sentence.substring(0 , 4);
        System.out.println(word);

        String word2 = sentence.substring(8 , 11);
        System.out.println(word2);

        String word3 = "i am studing online it from cybertek";
        String firstCharacter1 = word3.substring(13 , 24);
        System.out.println("======================================");

        String firstName = "cRISTINa";
        String firstCharacter = firstName.substring(0,1);
        String rest = firstName.substring(1, firstName.length() ); // firstName.length(): lastIndex + 1

        firstName = firstCharacter.toUpperCase() + rest.toLowerCase();

        System.out.println(firstName);

        System.out.println("==========================================");

        String lastName = "school";
        String firstChar = lastName.substring(0,1);
        String remaining = lastName.substring(1);
        System.out.println(firstName);
        System.out.println(remaining);

        lastName = firstChar.toUpperCase() + remaining.toLowerCase();
        System.out.println(lastName);

        String s = "I like Game Of Thrones";
        //          01234567
        String series = s.substring(7);

        System.out.println(series);


        String s2 = "I like Java Programming Language";
        //           01234567

        String language = s2.substring(7);

        System.out.println(language);






    }
}

