package replit_practice;

import java.util.Arrays;

public class replit_Assessment4_1 {
    public static void main(String[] args) {
        int[] nums = {1,2,5,4,6,7,3};
        boolean isSorted = true;
        int[] Sorted = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            Sorted[i]=nums[i];
        }
        Arrays.sort(Sorted);

        for(int j=0;j<Sorted.length;j++){
            if(Sorted[j]==nums[j]){
                isSorted=true;
            }else{
                isSorted = false;
            }

        }

    }
}
