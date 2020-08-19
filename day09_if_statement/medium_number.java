package day09_if_statement;

public class medium_number {
    public static void main(String[] args) {
        double a = 100;
        double b = 200;
        double c = 300;

        boolean aIaMed = ( a > b && a < c )|| ( a > c && a < b );
        boolean bIsMed = ( b > c && b < a )|| ( a < c && b > a );
        boolean cIsMed = !aIaMed && !bIsMed;
        double med = 0;
        if(aIaMed){
            med = a ;
        }
        if(bIsMed){
            med = b;
        }
        if(cIsMed){
            med = c;
        }

        System.out.println(med);


    }
}
