package day12_Switch_Scanner;
import java.util.Scanner;
public class input_practice5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter seconds:");
        int inputseconds = input.nextInt();
        int seconds = inputseconds%60;
        int minutes = (inputseconds/60)%60;
        int hours =(inputseconds/60)/60;
        System.out.println(hours+" hours, "+minutes+" minutes, and "+seconds+" seconds");




    }
}
