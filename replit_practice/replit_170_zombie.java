package replit_practice;

import java.util.Arrays;
import java.util.Scanner;

public class replit_170_zombie {
    public static void main(String[] args) {



        int[] inhabitants ={3, 6, 0, 4, 3, 2, 7, 0};


        int count=0;
        for(int k=0;;k++){
            System.out.println("Day "+k+" "+Arrays.toString(inhabitants));
            count=0;
            for(int j=0; j<inhabitants.length-1; j++) {
                if(inhabitants[j+1] == 0){
                    inhabitants[j]/=2;
                    count++;
                    continue;
                }
                if(inhabitants[j]==0){
                    inhabitants[j+1]/=2;
                    count++;
                    j++;
                }
            }
            if(count==inhabitants.length-1) break;
        }
        System.out.println("---- EXTINCT ----");






    }
}
