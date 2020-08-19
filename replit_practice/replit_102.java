package replit_practice;

import java.util.Scanner;

public class replit_102 {
    public static void main(String[] args) {

        String html = "<abc>invalid</abc>";


        if(html.contains("html")){
            String idindex=html.substring(html.indexOf("id=\"")+1,html.lastIndexOf("\""));
            System.out.println(idindex);
        }else{
            System.out.println("Invalid input!");
        }
    }
}
