package replit_practice;

import Library.Util;

public class replit_assessment2_1 {
    public static void main(String[] args) {

    }

    public static boolean appearsTwice(String target, String sentence) {
        //write your codes here:


        int count = 0;
        int charcount = target.length();
        for (int i = 0; i < sentence.length() - charcount; i++) {
            String currentword = sentence.substring(i, i+charcount);
            if (currentword.equals(target)) {
                count++;
            }
        }
        boolean twice = count == 2;
        return twice;
    }
}