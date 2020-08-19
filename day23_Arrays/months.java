package day23_Arrays;

import java.util.Scanner;

public class months {
    public static void main(String[] args) {

        String[]  months = {"January","February","March","April","May","June","July",
        "August","September","October","November","December"};
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1 ~ 12");
        int n = scan.nextInt(); // 5

        System.out.println( months[n-1] );




    }
}
