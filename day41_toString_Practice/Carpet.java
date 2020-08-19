package day41_toString_Practice;

import java.text.DecimalFormat;

public class Carpet {
    double width;
    double length;
    double unitPrice;
    boolean isPersian;

    public void customOrder(double width, double length, double unitPrice, boolean isPersian ){
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
        // instance         local
    }

    public double calcCost(){
        double totalPrice = (width * length)* unitPrice; // 200
        if(isPersian){
            totalPrice+= 200;
        }
        // return isPersian ? totalPrice+200:totalPrice
        return  totalPrice ;
    }

    public void getCarpetInfo(){
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("=============================");
        System.out.println("Width: "+width);
        System.out.println("Length: "+ length);
        System.out.println("Unit Price: "+ unitPrice);
        System.out.println("Persian Carpet: "+isPersian);
        System.out.println("Total Price: "+  df.format( calcCost() )  );
        System.out.println("=============================");
    }

    public String toString(){
        return "Width: "+width +", length: "+length+", Persian: "+isPersian;
    }




/*
carpet1
carpet2
carpet3
 */

}
