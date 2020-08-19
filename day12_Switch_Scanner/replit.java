package day12_Switch_Scanner;
public class replit {
    public static void main(String[] args) {

        int numberOfBedrooms=2;
        int startingPrice =1100;
        String result ="";
        if(numberOfBedrooms==1){
            result = "One Bedroom Selected";
            startingPrice = 1100;
        }else if(numberOfBedrooms==2){
            result = "Two Bedroom Selected";
            startingPrice = 1850;
        }else if(numberOfBedrooms==3){
            result = "Three Bedroom Selected";
            startingPrice = 2550;
        }else{
            result = "No such Bedrooms available";
        }
        System.out.println(result+"\nstarting Price: "+startingPrice);

        int x=3;
        int max=(x>=5)?x:-x;
        System.out.println(max);

        int num1 = 188;
        int num2 = 200;
        int result1 = (num1>num2)?num1:num2;
        System.out.println(result1);


    }
}

