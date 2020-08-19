package day12_Switch_Scanner;

public class replit2 {
    public static void main(String[] args) {

        int age=16;

        String result1 ="";
        boolean ineligible = age<2||age>18;
        boolean toddler = age==2;
        boolean earlychildhood =age==3||age==4||age==5;
        boolean youngreader =age==6||age==7;
        boolean elementary  = age==8 ||age==9||age==10;
        boolean middle  = age==11||age==12;
        boolean impossible= age==13;
        boolean highschool=age==14||age==15||age==16;
        boolean scholar = age==17||age==18;
        if(ineligible){
            result1="ineligible";
        }else if(toddler){
            result1="toddler";
        }else if(earlychildhood){
            result1="early childhood";
        }else if(youngreader){
            result1="young reader";
        }else if(elementary){
            result1="elementary";
        }else if(middle){
            result1="middle";
        }else if(impossible){
            result1="impossible";
        }else if(highschool){
            result1="high school";
        }else if(scholar){
            result1="scholar";
        }
        System.out.println(result1);

        int num1 = 0;
        if(num1<0){
            System.out.println(num1+" is negative");
        }else if(num1==0){
        }else{
            System.out.println(num1+" is positive");
        }


        int num =1024;
        String result =(num%2 ==0)?num+" is Even":num+" is Odd";
        System.out.println(result);







    }
}
