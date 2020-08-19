package day12_Switch_Scanner;
import java.util.Scanner;
public class userInput6 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter number of milligrams in drink:");
        int milligrams = input.nextInt();
        int eachDrink = input.nextInt();
        int milligramsInGram = milligrams/100;
        int numberOfDrinks = milligrams/25;
        System.out.println("It would take about "+numberOfDrinks+" drinks for a lethal overdose.");

    }
}
