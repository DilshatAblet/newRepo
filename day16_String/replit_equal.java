package day16_String;

import java.util.Scanner;
import java.util.SplittableRandom;

public class replit_equal {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        //DO NOT CHANGE ABOVE CODE!  Write your code below
        String teacher = "Chen";
        if(name.equals(teacher)){
            System.out.println("teacher");
        }else {
            System.out.println("student");
        }


    }
}
