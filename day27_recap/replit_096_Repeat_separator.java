package day27_recap;

import java.util.Scanner;

public class replit_096_Repeat_separator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();
        int separatorcount = count -1;

        String result="";
        for(int i =1;i<=count-1;i++){
            result += word+separator;
        }
        result+=word;
        System.out.println(result);




    }
}
