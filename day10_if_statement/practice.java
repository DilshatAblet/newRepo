package day10_if_statement;

import com.sun.security.jgss.GSSUtil;

public class practice {
    public static void main(String[] args) {
        int n1 = 18;
        int n2 = 7;
        int n3 = 15;

        //Write your code here:
        if(n2>n3 && n2>n1){
            System.out.println("n2 is biggest");
        }else if(n1>n3 && n1>n2){
            System.out.println("n1 is biggest");
        }else{System.out.println("n3 is biggest");}
        int x=10;
        int y=2;
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
        System.out.println(x%y);

    }
}
