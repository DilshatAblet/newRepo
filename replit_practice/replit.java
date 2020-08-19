package replit_practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class replit {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i =0; i < size; i++) {
            nums[i] = scan.nextInt();
        }
        int[] num1 = new int[size*2];
        num1[num1.length-1]=nums[nums.length-1];
        System.out.println(Arrays.toString(num1));






    }
}
