package day13_scanner;
import java.util.Scanner;
public class nextline_vs_nextMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        double salary = scan.nextDouble();
        scan.nextLine();

        System.out.println("Enter your full name: ");
        String fullname= scan.nextLine();

        System.out.println("salary: "+salary);
        System.out.println("full name: "+fullname);








    }
}
