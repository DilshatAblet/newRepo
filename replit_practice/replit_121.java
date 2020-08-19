package replit_practice;

import java.util.Scanner;

public class replit_121 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        int count =0;
        for(int each:nums){
            if(each%2==0){
                count+=1;
            }
        }
        System.out.println(count);

    }
}
