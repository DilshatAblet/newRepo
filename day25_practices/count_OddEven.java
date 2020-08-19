package day25_practices;

public class count_OddEven {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7,8,9,10,11};
        int countEven = 0;
        int countOdd =0;

        for(int each :nums){
            if(each%2==0){
                countEven +=1;
                continue;
            }
            countOdd++;
        }




    }
}
