package replit_practice;

import java.util.Arrays;
import java.util.Scanner;

public class replit_139 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];
        for(int i =0; i < size; i++) {
            num[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE

        if(size>=2){
            int[] arr=new int[2];
            arr[0]=num[0];
            arr[1]=num[1];
            System.out.println(Arrays.toString(arr));
        }else{
            int[] arr=new int[1];
            arr[0]=num[0];
            System.out.println(Arrays.toString(arr));
        }

    }
}
