package day13_scanner;

import java.util.Scanner;

public class Scanner_nextline {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your full name");
        String fullName = scan.nextLine();
        System.out.println("Enter your company name: ");
        String companyName = scan.nextLine();
        System.out.println("Full name : "+fullName);
        System.out.println("company name "+companyName);







    }
}
