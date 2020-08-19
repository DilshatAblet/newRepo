package day12_Switch_Scanner;
import java.util.Scanner;
public class User_input_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int areaCode = input.nextInt();
        int localNumber = input.nextInt();
        String phoneNumber = "("+areaCode+")"+"-"+localNumber;
        System.out.println("Calling number "+phoneNumber);





    }
}
