package day12_Switch_Scanner;
import java.util.Scanner;
public class userInput {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter 3 numbers:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        System.out.println("Sum of numbers: "+(num1+num2+num3));



    }
}
