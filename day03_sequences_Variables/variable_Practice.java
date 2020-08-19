package day03_sequences_Variables;

public class variable_Practice {
    public static void main(String[] args) {

        // double>float>long>int>shore>byte

       int salary = 120000;
       double tax = 0.375;
       double totalTax = salary * tax;
       System.out.println(totalTax);
       double salaryAfterTax = salary-totalTax;
       System.out.println(salaryAfterTax);
        byte weeks = 52;
        double weeklySalary = salaryAfterTax/weeks;
        System.out.println(weeklySalary);


        double kg = 85;
        double pound = kg*2.2;
        System.out.println(pound);

    }
}
