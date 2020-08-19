package day25_practices;

public class replit_arrays_max {
    public static void main(String[] args) {
        int[] arr = {2,1,8,5,9};
        int max = arr[0];

        for(int i =1;i<=arr.length-1;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.print(max);





    }
}
