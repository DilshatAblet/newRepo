package day05_ArithmeticOperators;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Employee_Info {
    public static void main(String[] args) {
        /*write a program that can display the full info of the employee
                    ex:
                             firstName = John
                             lastName = Daniel
                             gender = Male
                             age = 35
                             companyName = CapitalOne
                             jobTitle = SDET
                             isFullTime = true
                             isMarried = false
                             salary = 120000.50
             output:
                        Employee' full name is: John Daniel
                        John Daniel' gender is: Male
                        John Daniel' age is: 35 years old
                        John Daniel works at: CapitalOne
                        John Daniel' Job title is: SDET
                        John Daniel' salary is 120000.5 $
                        John Daniel is full time employee: true
                        John Daniel is married: false */
        String firstName = "John";
        String lastName = "Daniel";
        int age = 35;
        String companyName = "Capital One";
        char gender = 'M';
        String jobTitle = "SDET";
        int salary = 125000;
        boolean isFullTime = true;
        boolean isMarried = false;
        String fullName = firstName+" "+lastName;

        System.out.println("Employee's full name is: "+firstName+" "+lastName );
        System.out.println(firstName+" "+lastName+"'s age is: "+age+" years old");
        System.out.println(firstName+" "+lastName+"'s gender is: "+gender);
        System.out.println(firstName+" "+lastName+" works at "+companyName);
        System.out.println(firstName+" "+lastName+" works as "+jobTitle);
        System.out.println(firstName+" "+lastName+" salary is: $"+salary);
        System.out.println(firstName+" "+lastName+" is full time employee: "+ isFullTime);
        System.out.println(firstName+" "+lastName+" is married: "+ isMarried);
    }
}
