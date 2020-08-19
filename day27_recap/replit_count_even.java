package day27_recap;

import java.util.Arrays;
import java.util.Scanner;

public class replit_count_even {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = new int[10];
        for(int i = 0 ; i<=9 ; i ++){
            nums[i] = input.nextInt();
        }
        int count = 0;
        for(int each :nums) {
            if (each % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);


    }
}
