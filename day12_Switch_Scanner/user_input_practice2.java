package day12_Switch_Scanner;

import java.util.Scanner;

public class user_input_practice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your First number:");
        int a = scan.nextInt();

        System.out.println("Enter your Last number");
        int b = scan.nextInt();

        System.out.println("sum of those two numbers are:"+(a+b));




    }
}
