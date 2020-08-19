package Office_hours.practice_20_07;

public class Max_3DArray {
    public static void main(String[] args) {

        int[][][] arr3D = {  {{1,2}, {3,4000}}  ,  {{5,6,7}, {8, 9,10}}  };
        //                         0                       1

        int max = arr3D[0][0][0];


        for( int[][] each2D : arr3D ){
            for(int[] each1D : each2D){
                for(int eachElement : each1D ){
                    if(eachElement > max){
                        max = eachElement;
                    }
                }
            }
        }


        System.out.println("Maximum: "+max);



    }
}