package day20;

import java.util.Scanner;

public class replit3 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String email = scan.next();

        if(email.contains("_")) {
        int index1 = email.indexOf("_");
        int index2 = email.lastIndexOf("_");
        int index3 = email.indexOf("@");

        String firstName = email.substring(0,index1 );
        String lastName = email.substring(index2+1,index3);
        String domain = email.substring(index3);
        String reversename = lastName + "_" + firstName + domain;
            System.out.println(reversename);
        }else{
            System.out.println(email);
        }


    }
}
