package replit_practice;

import java.util.Scanner;

public class replit_125 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(),
                scan.next(), scan.next(), scan.next()};

        String less =str[0];
        for(int i=0;i<str.length;i++){
                if(str[i].length()<less.length()){
                    less=str[i];
            }
        }
        System.out.println(less);
    }
}
