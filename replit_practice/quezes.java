package replit_practice;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class quezes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float[] score = new float[7];
        //WRITE YOUR CODE HERE1

        for(int i =0;i<7;i++) {

            System.out.println("Enter score for judge " + (i + 1) + ":");
            score[i] = input.nextFloat();

        }
        System.out.println("Enter difficulty:");
        float difficulty =input.nextFloat();

        float max =score[0];  float min=score[0];  float total=0;
        for(float each :score){
            total+=each;
            if(max<each){
                max=each;
            }if(min>each){
                min=each;
            }
        }
            total=((total-max-min)*difficulty)*0.6f;








    }
}
