package day23_Arrays;

public class max_min {
    public static void main(String[] args) {

        int[] arr = {10,20,3,4,5,6,7,-10,-100,300,400};
        int max =0; int min =0 ;

        for(int i = 0; i<=arr.length-1;i++){

            if(arr[i]>max){
                max = arr[i];
            }else if(arr[i]<min){
                min = arr[i];
            }


        }
        System.out.println("max number is: "+max);
        System.out.println("min number is: "+min);




    }
}
