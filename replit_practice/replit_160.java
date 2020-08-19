package replit_practice;

public class replit_160 {
    public static void main(String[] args) {
     String[] words = {"java", "code", "python", "code", "rust", "code", "rust"};
        for(int k=0;k<words.length;k++){
            String first = words[k];
            int count = 0;
            for(int l=0;l<words.length;l++){
                String second = words[l];
                if(first.equals(second)){
                    count++;
                }
            }
            if(count==1)
                System.out.println(first);
        }



    }
}
