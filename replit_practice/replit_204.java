package replit_practice;

import java.lang.reflect.Array;
import java.util.*;

public class replit_204 {
    public static boolean isAnagram(String word1, String word2) {

        if(word1.length()!=word2.length())
            return false;

        char[] word1char = word1.toLowerCase().trim().toCharArray();
        char[] word2char = word2.toLowerCase().trim().toCharArray();

        Arrays.sort(word1char);
        Arrays.sort(word2char);



        return Arrays.equals(word1char,word2char);
    }
    public static int[] addElements(int[] ints1, int[] ints2) {

        int[] result = new int[ints1.length];
        for(int i=0;i<ints1.length;i++){
            result[i]+=ints1[i];
        }
        for(int i=0;i<ints2.length;i++){
            result[i]+=ints2[i];
        }
        return result;

    }

    public static int[] do_switch(int[] i) {

        int tem =i[0];
        i[0]=i[i.length-1];
        tem = i[0];
        return i;


    }

}
