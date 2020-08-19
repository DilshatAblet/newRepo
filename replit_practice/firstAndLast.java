package replit_practice;

public class firstAndLast {
    public static void main(String[] args) {
        String str = "hi how are you.hi";

        int charcount = 2;
        int count =0;
        for(int i=0;i<=str.length()-charcount;i++) {
            String currentword = str.substring(i, i + charcount);
            if(currentword.equals("hi")){
                count++;
            }
        }
        System.out.println(count);



    }
}
