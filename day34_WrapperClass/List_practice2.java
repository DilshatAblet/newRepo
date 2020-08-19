package day34_WrapperClass;

import java.util.ArrayList;

public class List_practice2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(100);
        list.add(90);
        list.add(1);
        list.add(16);
        list.add(18);
        list.add(106);
        list.add(106);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer each: list){
            if(each>max){
                max=each;
            }
            if(each<min){
                min=each;
            }
        }

        System.out.println("Max is :"+max);
        System.out.println("Min is :"+min);

    }
}
