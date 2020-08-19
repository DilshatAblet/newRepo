package replit_practice;

import java.util.Scanner;

public class replit_101 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();


        int jacount=0;int pycount=0;
        int charcount=sentence.length();
        int tcharcount = 4;

        for(int i =0;i<=charcount-tcharcount;i++){
        if(sentence.substring(i,i+tcharcount).equals("java")){
            jacount++;
        } }
        tcharcount=6;
        for(int i =0;i<=charcount-tcharcount;i++){
            if(sentence.substring(i,i+tcharcount).equals("python")){
                pycount++;
            }
        }
        System.out.println(jacount==pycount);


    }
}
