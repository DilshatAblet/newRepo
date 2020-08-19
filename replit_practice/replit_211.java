package replit_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class replit_211 {
    public static ArrayList<Integer> removeInst(ArrayList<Integer> r,Integer n){

        r.removeAll(Arrays.asList(n));
        return r;

    }

    public static ArrayList<String> removeAll (ArrayList<String> wordList ,String targetWord){

        wordList.removeAll(Arrays.asList(targetWord));
        return wordList;
    }

    public static String search(ArrayList<String> r, String find){
        String result ="";
    for(String each:r){
        if(each.contains(find)) result = each;
        }
    if(!(r.contains(find))&&result.isEmpty()) result = "search failed";

        return result;

    }//end wineSeller





    public static void main(String[] args){

        ArrayList<Integer>  arr = new ArrayList<>();
        Integer[] nums = new Integer[]{1,1,2,3};
        arr.addAll(Arrays.asList(nums));

        System.out.print(removeInst(arr,1));


    }//end main

    public static ArrayList<Integer> twoTimes(ArrayList<Integer> twice){

        ArrayList<Integer> repeat = new ArrayList<>();
        for(int i=0;i<twice.size();i++){
            repeat.add(twice.get(i));
            repeat.add(twice.get(i));
        }

        return twice;
    }



}