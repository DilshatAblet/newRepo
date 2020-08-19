package day11_nestedIf_ternary;

public class days_in_month {
    public static void main(String[] args) {

        int month = 7;
        boolean validNumber= month>=1 && month <=12;
        String result = "";
        boolean days28 = month == 2;
        boolean days30 = month == 4||month==6||month==9||month==11;
        if(validNumber){
            if(days28){
                result ="28 days";}
            else if (days30){
                result = "30 days";
            }else{
                result = "31 days";
            }


        }else{
            System.out.println("invalid number");
        }

        System.out.println(result);


    }
}
