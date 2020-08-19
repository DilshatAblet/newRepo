package day13_scanner;

import java.util.Scanner;

public class next_practice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstname =scan.next();

        System.out.println("Enter your last name: ");
        String lastName = scan.next();

        String fullName = firstname+" "+lastName;
        System.out.println(fullName);



    }
}
