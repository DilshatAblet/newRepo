package day08_LogicalOperator;

public class Practice {
    public static void main(String[] args) {

        String firstName = "Aaron";
        String lastName = "Daniel";
        int age = 19;
        String citizenship = "USA";
        boolean eligible = age>= 18 && citizenship=="USA";

        System.out.println(firstName+" "+lastName+" is eligible to vote: "+eligible);







    }
}
