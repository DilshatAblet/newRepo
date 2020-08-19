package day13_scanner;
import java.util.Scanner;
public class practice2 {
    public static void main(String[] args) {
/*Example1:

Display prompt: "Enter number of coupons:"
13
Display prompt: "Number of Candies: 1"
Display prompt: "Number of Gumballs: 1"

Example2:

Display prompt: "Enter number of coupons:"
23
Display prompt: "Number of Candies: 2"
Display prompt: "Number of Gumballs: 1"

Example3:

Display prompt: "Enter number of coupons:"
2
Display prompt: "Not enough coupons"*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of coupons:");
        int numberOfCoupons = scan.nextInt();
        int gumballs = (numberOfCoupons%10)/3;
        int candy = numberOfCoupons/10;
        int minimumCoupon = 3;
        if(numberOfCoupons>=minimumCoupon){
            System.out.println("Number of Candies: "+candy);
            System.out.println("Number of Gumballs: "+gumballs);
        }else{

            System.out.println("Not enough coupons");
        }











    }
}
