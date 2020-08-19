package day14_recap;

import java.util.Scanner;

public class Address {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Enter your building number: ");
        int buildingN =  input.nextInt();
        input.nextLine();
        System.out.println("Enter your street address: ");
        String street = input.nextLine();


        System.out.println("Enter your city name: ");
        String cityName = input.nextLine();

        System.out.println("Enter your state: ");
        String State = input.next();
        input.nextLine();

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();
        System.out.println(fullName+" "+"\n"+buildingN+" "+street+" "+cityName+
        " "+State);




    }
}
