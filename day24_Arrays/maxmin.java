package day24_Arrays;

import java.util.Scanner;

public class maxmin {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n-1 ;i++){
            System.out.println("Enter a number");
            int num = scan.nextInt();
            arr[i] = num;
        }

        for(int i = 0; i<=arr.length-1;i++){
            System.out.println(arr[i]+" ");
        }




    }
}
