package replit_practice;

public class replit_169 {
    public static void main(String[] args) {

        String one ="1234";
        String two = "5678";
        String result ="";

        for(int i = 0;i<one.length()||i<two.length();i++){
            if(i<one.length()) result+=one.charAt(i);
            if(i<two.length()) result+=two.charAt(i);
        }
        System.out.println(result);
    }
}
