package day14_recap;

import java.util.Scanner;

public class dilshat {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        boolean isTall = scan.nextBoolean();
        boolean isfat = scan.nextBoolean();
        boolean isflexi = scan.nextBoolean();
        String sport ="";

        if(isTall){
            if(isfat){
                sport ="basket";

            }else if (isflexi){
                sport="gymnas";
            }else{
                sport="volley";

            }
        }else{
            if(isfat){
                sport="soccor";

            }else{
                sport="tennis";
            }
        }
        System.out.println(sport);









    }
}
