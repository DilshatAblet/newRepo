package day15_String;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your First name");
        String FisrtName = scan.next();

        System.out.println("Enter your Last name ");
        String lastName = scan.next();

        String fullName = FisrtName.concat(" ".concat(lastName));
        System.out.println(fullName);




    }
}
