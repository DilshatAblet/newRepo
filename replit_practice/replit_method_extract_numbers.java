package replit_practice;

import java.util.ArrayList;

public class replit_method_extract_numbers {
    public static void main(String[] args) {
        String s ="2ggr5753";
        String m = "";
        for(int i =0 ;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                m+=ch+"";
            }
        }

        String check ="noon";

        String rev = "";
        boolean isPalindrome = true;
        check.trim();
        for(int i =check.length()-1;i>=0 ;i--){
            rev+=check.charAt(i);
        }
        if(rev.equalsIgnoreCase(check)){
            isPalindrome=true;
        }else{
            isPalindrome=false;
        }

        System.out.println(isPalindrome);

    }

    public static String extractNum(String s) {

        String[] result = s.split("");
        String m = "";
        for(int i =0 ;i<result.length;i++){
            if(result[i].equals(0-9)){
                m+=result[i]+"";
            }
        }
        return m;

    }
}
