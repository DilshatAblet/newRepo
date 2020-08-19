package day11_nestedIf_ternary;

public class nested_if_practice3 {
    public static void main(String[] args) {
        /*
        Task01:
            precondition: minimum salary of 30k
                sub condition: minimum 2 years of job history
        Task02:
            1 monday
            2 Tuesday
            3 Wednesday
            ...
            7 Sunday
            invalid ==> there is no such a day
        Task03:
            write a program that can find the number of days in a months
                        (MUST APPLY NESTED IF)
        come back at: 3:25;
         */
        double salary = 120_000;
        int jobHistory = 5;

        if(salary >= 30000){
            if(jobHistory>= 2 ){
                System.out.println("you are qualified!");
            }else{
                System.out.println("you must have been on the job at least 2 years");
            }
        }else{
            System.out.println("you must earn at least $30k annually");
        }

        int day = 4;
        boolean validNumber = day>=1 && day<=7;
        String result = "";
        if(validNumber){
            if(day==7){result = "sunday";}
            else if(day==6){result = "saturday";}
            else if(day==5){result = "friday";}
            else if(day==4){result = "thursday";}
            else if(day==3){result = "wensday";}
            else if(day==2){result = "tuesday";}
            else if(day==1){result = "monday";}
            result= (day==7)?"sunday":(day==6)?"saturday":(day==5)?"friday":(day==4)?
                    "thursday":(day==3)?"wednesday":(day==2)?"tuesday":"monday";
        }else{System.out.println("invalid entry");}
            System.out.println(result);







    }
}
