package day14_recap;
import java.util.Scanner;
public class replit2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter price in cents:");
        int itemprice = scan.nextInt();
        int change = 100-itemprice;
        int quarters = change/25;
        int dimes = (change%25)/10;
        int nickles = (change%25)%10/5;
        if(itemprice<25||itemprice>100||itemprice%5!=0){
            System.out.println("Invalid price!");
        }else{
            System.out.println("Your change is "+quarters+" quarters, "+dimes+
                    " dimes, and "+nickles+" nickels.");
        }











    }
}
