package day32_Method_Overloading;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

public class MethodOverloading2 {
    public static void main(String[] args) {

        addition2Numbers(10,20);
        addition3Number(10,20,30);
        addition4Number(10,20,30,40);

        System.out.println("================================");

        addition(10,20);
        addition(10,20,30);
        addition(10,20,30,40);

    }


    public static void addition2Numbers(double a, double b){
        System.out.println(a+b);
    }

    public static void addition3Number(double a, double b, double c){
        System.out.println(a+b+c);
    }

    public static void addition4Number(double a, double b, double c, double d){
        System.out.println(a+b+c+d);
    }

    //=============================================

    public static void addition(double a, double b){
        System.out.println(a+b);
    }

    public static void addition(double a, double b, double c){
        System.out.println(a+b+c);
    }

    public static void addition(double a, double b, double c, double d){
        System.out.println(a+b+c+d);
    }



}
