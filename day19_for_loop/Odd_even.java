package day19_for_loop;
import java.util.Scanner;
public class Odd_even {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();

        int sum = 0;

        if(num > 0){

            for(int i = 1; i <= num; i++){
                // sum = sum + i;
                sum += i;
            }

            System.out.println(sum);

        }else{
            System.out.println("Invalid Entry");
        }






    }
}
