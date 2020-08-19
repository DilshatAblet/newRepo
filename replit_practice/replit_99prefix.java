package replit_practice;

import java.util.Scanner;

public class replit_99prefix {
    public static void main(String[] args) {


        String str = "xxbreadjambreadyy";

        if(str.contains("bread")){
            int first = str.indexOf("bread");
            int last = str.lastIndexOf("bread");
            if(first==last){
                System.out.println("nothing");
            }else{
                System.out.println(str.substring(first+5,last));
            }

        }else{
            System.out.println("nothing");
        }



    }
}
