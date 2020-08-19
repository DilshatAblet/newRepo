package day16_String;

import java.util.Scanner;

public class SunString_practice {
    public static void main(String[] args) {

        String str = "I like to drink Pepsi";
        String drink = str.substring(16);
        System.out.println(drink);

        String action = str.substring(10,14+1);
        System.out.println(action);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word");
        String str1 = scan.next();

        System.out.println("your second word");
        String str2 = scan.next();

        String result = str1.substring(1).concat(str2.substring(1));
        String result2 = str1.substring(1)+str2.substring(1);
        System.out.println(result2);






    }
}
