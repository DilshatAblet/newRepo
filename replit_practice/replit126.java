package replit_practice;

import java.util.*;

public class replit126 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String[] words = str.split(",");

        String shortWord=words[0];

        for(String each : words){
            if(each.length()<shortWord.length()){
                shortWord=each;
            }
        }
        int countOfShort=0;

        for(String each:words){
            if(each.length()==shortWord.length()){
                System.out.println(words);
                countOfShort++;
            }
        }

        String[] shortestwordarr=new String[countOfShort];
        int i=0;
        for(String currentWord :words){
            if(currentWord.length()==shortWord.length()){
                shortestwordarr[i]=currentWord;
                i++;
            }
        }
        Arrays.sort(shortestwordarr);
        System.out.println(Arrays.toString(shortestwordarr));



    }
}
