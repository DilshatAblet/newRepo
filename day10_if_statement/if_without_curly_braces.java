package day10_if_statement;

public class if_without_curly_braces {
    public static void main(String[] args) {
        if(9<10)
        System.out.println("hello");
        System.out.println("how are you?");
        int grade=99;
        if(grade>=90 && grade<=100){
            System.out.println("exellent");
        }
        else if(grade<=89 && grade>=70){
            System.out.println("good");
        }else if(grade<=69 && grade>=60){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }




    }
}
