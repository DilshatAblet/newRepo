package Office_hours.practice_21_07_2020;

import java.util.Arrays;

public class practice_21_07_2020 {
    public static void main(String[] args) {

        int[] arr ={98,97,100,200,55,68};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int[] decending = new int[arr.length];

        int k=arr.length-1;
        for(int each :arr){
            decending[k]=each;
            k--;
        }
        System.out.println(Arrays.toString(decending));
    }
}
