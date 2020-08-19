package day34_WrapperClass;

import java.util.ArrayList;

public class list_intro {
    public static void main(String[] args) {

        ArrayList<Integer> scores =new ArrayList<Integer>();
        scores.add(95);
        scores.add(100);
        scores.add(85);
        scores.add(75);
        scores.add(1,65);

        System.out.println(scores);

        System.out.println(scores.get(2));







    }
}
