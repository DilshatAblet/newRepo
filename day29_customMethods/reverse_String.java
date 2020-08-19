package day29_customMethods;

import javax.imageio.stream.ImageInputStream;

public class reverse_String {
    public static void main(String[] args) {
        reverse("dilshat");
        reverse("Cybertek");
    }
    public static void reverse(String str){
     String result ="";
     for(int i=str.length()-1;i>=0;i--){
         result+=str.charAt(i);
     }
        System.out.println(result);
    }
}
