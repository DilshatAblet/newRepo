package day13_scanner;
import java.util.Scanner;
public class practice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your annual salary: ");
        int salary  =input.nextInt();
        System.out.println("Enter your state tax rate: ");
        double ststeTaxRate = input.nextDouble();
        double stateTax = salary * ststeTaxRate;
        System.out.println("Enter your federal tax rate: ");
        double federaltaxrate = input.nextDouble();
        double federalTax = salary*federaltaxrate;
        double salaryAfterTax = salary-stateTax-federalTax;
        System.out.println("your salary: $ "+salary);
        System.out.println("your state tax: $ "+stateTax);
        System.out.println("your federal tax : "+federalTax);
        System.out.println("your salary after tax: "+salaryAfterTax);




    }
}
