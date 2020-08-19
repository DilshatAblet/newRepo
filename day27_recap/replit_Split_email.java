package day27_recap;

import java.util.Scanner;

public class replit_Split_email {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String email = input.nextLine();

        String[] split = email.split("@");
        if(email.indexOf("@")!=email.lastIndexOf("@")||email.indexOf("@")==-1){
            System.out.println("invalid email");
        }else{
            System.out.println("Email id: "+split[0]);
            System.out.println("Email domain: "+split[1]);
        }



    }
}
