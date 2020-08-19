package day08_LogicalOperator;
public class if_statement {public static void main(String[] args){
    int a = 10;
    int b = 20;
    if(a>b){System.out.println(a+" is the maximum number");
    }
    if(a<b){System.out.println(b+" is the maximum number");
    }
    if(a==b){System.out.println(a+" "+b+" are equal numbers");
    }
        int number=100;
        boolean even=number%2==0;
        boolean odd =!even;
        if(even){
            System.out.println(number+" is even number");
        }
        if(odd){
            System.out.println(number+" is odd number");
        }

        int num = -2;
    if(num>0){
        System.out.println("positive");
    }
    if(num<0){
        System.out.println("negative");
    }
    if(num==0){
        System.out.println("zero");
    }


   }

}
