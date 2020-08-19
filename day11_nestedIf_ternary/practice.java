package day11_nestedIf_ternary;

public class practice {
    public static void main(String[] args) {
        int num = 8;
        String result = "";
        if(num==0){
            result = "zero";
        }else if(num == 1){
            result ="one";
        }else if(num == 2) {
            result = "three";
        }else if(num == 4) {
            result = "four";
        }else if(num == 5) {
            result = "five";
        }else if(num == 6) {
            result = "six";
        }else if(num == 7) {
            result = "seven";
        }else if(num == 8) {
            result = "eight";
        }else if (num == 9) {
            result = "nine";
        }else if (num == 10) {
            result = "six";}
        System.out.println(result);

        String result2=(num==0)?"zero":(num==1)?"one":(num==2)?"two":(num==3)?"three":
                (num==4)?"four": (num==5)?"five":(num==6)?"six":(num==7)?"seven":
                (num==8)?"eight":(num==9)?"nine": (num==10)? "ten":"invalid entry";
        System.out.println(result2);


    }
}