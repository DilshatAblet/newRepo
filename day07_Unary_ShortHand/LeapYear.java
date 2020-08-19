package day07_Unary_ShortHand;

public class LeapYear {
    public static void main(String[] args) {
        //create a class called LeapYear, and write a program that can identify
        // if the given is Leap Year, print true if it's leap year, otherwise
        // print false

            int year = 2040;
            boolean result = year % 4 == 0;

        System.out.println("year "+year +" is a leap year: "+result);



    }
}
