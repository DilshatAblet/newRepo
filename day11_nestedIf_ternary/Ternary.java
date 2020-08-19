package day11_nestedIf_ternary;

public class Ternary {
    public static void main(String[] args) {

        int num =100;
        String result ="";
        if(num%2 == 0){
            result = "Even";
        }else{
            result ="Odd";
        }
        String results2 = (num%2 == 0)?"Even":"Odd";
        System.out.println(results2);

        System.out.println(result);

        int num1 = 10;
        int num2 = 20;
        int max1=0;
        if(num1>num2){
            max1=num1;
        }else {
            max1=num2;
        }
        System.out.println(max1);
        int max2= (num1>num2)?num1:num2;
        System.out.println(max2);
        System.out.println("=================================================");
        int num3= 20;
        boolean eligible = true;
        String eligible2 =(num3>21)?"Can Vote":"cannot vote";
        System.out.println(eligible2);




    }
}
