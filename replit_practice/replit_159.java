package replit_practice;

public class replit_159 {
    public static void main(String[] args) {
        int[] nums = {2, 5, 5, 6, 3, 6, 9, 34, 3};

        for (int i = 0; i < nums.length; i++) {
            boolean isUnique =true;
            for(int j=0;j<nums.length;j++){
             if(nums[i]==nums[j] && j!=i){
                 isUnique = false;
                 break;
             }
            }
            if(isUnique)
                System.out.println(nums[i]);
        }



        for(int k = 0; k<=nums.length-1;k++){
            int count =0;
            int num1 = nums[k];
            for(int l=0;l<=nums.length-1;l++){
                int each = nums[l];

                if(num1==each){
                    count++;
                }
            }
            if(count==1)
                System.out.print(num1+" ");


        }







    }
}
