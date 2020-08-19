package day11_nestedIf_ternary;

public class Ternary_practice {
    public static void main(String[] args) {

        int age = 23;
        String citizen = "USA";

        String result ="";
        if(age>=18&&citizen=="USA"){
            result = "Can Vote";
        }else{
            result = "Can't vote";
        }
        System.out.println(result);

        String result2 = (age>=18&&citizen=="USA")?"Can Vote":"Can't vote";
        System.out.println(result2);


    }
}
