package day12_Switch_Scanner;

import java.util.Scanner;

public class user_input_practice3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your salary: ");
        int salary = input.nextInt();

        System.out.println("how many hours do you work in a week ");
        int weeklyHours = input.nextInt();

        int totalHours = weeklyHours * 52;
        double hourlyRate = salary/totalHours;
        System.out.println("your hourly rate is: $"+hourlyRate);











    }
}
