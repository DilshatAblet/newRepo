package replit_practice;
import java.util.Arrays;
public class replit_179 {
    public static void main(String[] args) {
        System.out.println( uniqueChars("wooden-spoon") ) ;
    }

        public static String uniqueChars(String str) {
            //TODO: write your below
            String result = "";
            for(int i = 0;i<=str.length()-1;i++){
                String ch = str.substring(i,i+1);
                if(!result.contains(ch)){
                    result+=ch;
                }

            }

            return result;




    }
}