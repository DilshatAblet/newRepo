package day14_recap;

import day13_scanner.Scanner_nextline;

import java.util.Scanner;

public class replit {
    public static void main(String[] args) {
        //Declare 9 String variables firstName, lastName, fullName, email, street, state, city, address, contacts.
        Scanner scan =new Scanner(System.in);
        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");
        System.out.println("Enter your first name");
        String firstName = scan.nextLine();
        System.out.println("Enter your last name");
        String lastName = scan.nextLine();


        System.out.println("Enter your email");
        String email = scan.next();
        scan.nextLine();//to capture Enter key press
        System.out.println("Enter your street");
        String street = scan.nextLine();

        System.out.println("Enter your city");
        String city = scan.nextLine();
        System.out.println("Enter your state");
        String state = scan.nextLine();
        System.out.println("Enter your zip code");
        int zipcode = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your work phone number");
        String workphonenumber = scan.nextLine();
        System.out.println("Enter your personal phone number");
        String personalphonenumber = scan.nextLine();
        System.out.println("Enter your age");
        int age = scan.nextInt();
        System.out.println("Enter your height");
        double height = scan.nextDouble();
        System.out.println("Enter your weight");
        double weight = scan.nextDouble();
        System.out.println("Are you married?");
        boolean isMarried = scan.nextBoolean();
        String fullName = lastName+", "+firstName;
        String contacts = "Contacts: work phone number - "+workphonenumber+
                ", personal phone number - "+ personalphonenumber+",  email: "
                +email;
        String address = street+", "+city+", "+state+", "+zipcode;
        System.out.println("Patient personal information"+"\n"+"Full name: "+
                fullName+"\n"+"Address: "+address+"\n"+contacts+"\n"+"Age: "+age+"\n"+"Height: "+height+"\n"+
                "Weight: "+weight+" pounds"+"\n"+"Married?: "+isMarried);








    }
}
