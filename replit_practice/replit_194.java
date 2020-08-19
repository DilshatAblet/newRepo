package replit_practice;

import java.util.ArrayList;

public class replit_194 {
    public static void main(String[] args) {

        ArrayList<Integer> words = new ArrayList<>();
        words.set(0,4);
        words.set(2,10);


    }
    public static int sum(ArrayList<Integer> ints){
        //write code here

        Integer total = 0;
        for(int i =0 ;i<ints.size();i++){
            total += ints.get(i);
        }
        return total;


    }

    public static ArrayList<String> combineAL(ArrayList<String> wordList1 , ArrayList<String>wordList2) {
        ArrayList<String> combine = new ArrayList<>();
        for (String each : wordList1) {
            combine.add(each);
        }
        for (String each1 : wordList2) {
            combine.add(each1);
        }
        return combine;
    }

}
