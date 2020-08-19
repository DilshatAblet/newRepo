package day16_String;
import day12_Switch_Scanner.Switch_Statement;

import java.util.Scanner;
public class String_atChar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String item = scan.nextLine();
        switch(item){
            case "Pillow":
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: "+(100-40)+"$");break;
            case "Blanket":
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: "+(100-60)+"$");break;
            case "Socks":
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: "+(100-5)+"$");break;
            case "Hat" :
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: "+(100-25)+"$");break;
            case "Pants":
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: "+(100-50)+"$");break;
            case "Headphones":
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: "+(100-30)+"$");break;
            case "USB cable":
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: "+(100-10)+"$");break;
            case "Charger":
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: "+(100-15)+"$");break;
            case "Laptop":
                System.out.println("Sorry, not enough funds on your gift card!");break;
            case "Smartphone":
                System.out.println("Sorry, not enough funds on your gift card!");break;
            default:
                System.out.println("Invalid item!");
        }





    }
}
