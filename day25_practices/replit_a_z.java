package day25_practices;

import java.util.Scanner;

public class replit_a_z {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char start = scan.next().charAt(0);
        char end = scan.next().charAt(0);


        for(int i =start ;i<=end;i++){
            char result = (char) i;
            System.out.println(result);
        }





    }
}
