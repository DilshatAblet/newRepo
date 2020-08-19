package day22_Nested_Loop;
import java.util.Scanner;
public class replit_tip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Split: ");
        String split =scan.nextLine();
        System.out.println("Number of people: ");
        int numberofpeople = scan.nextInt();
        System.out.println("Check amount: ");
        double checkamount = scan.nextDouble();
        scan.nextLine();
        System.out.println("Service Quality: ");
        String servicequality = scan.nextLine();

        double tip = 0;
        if(servicequality.equals("Poor")){
            tip = checkamount*0.05;
        }else if(servicequality.equals("Fair")){
            tip =checkamount*0.1;
        }else if(servicequality.equals("Good")){
            tip = checkamount*0.15;
        }else if(servicequality.equals("Great")){
            tip = checkamount*0.2;
        }else if(servicequality.equals("Excellent")){
            tip = checkamount*0.25;}
        double tipperperson = tip/numberofpeople;
        double perperson = (checkamount+tip)/numberofpeople;
        String andsymble ="";
        for(int i=1;i<=numberofpeople;i++){
            andsymble +="&";
        }
        System.out.println("Number of people entered: "+andsymble);
        System.out.println("Total to pay: "+(checkamount+tip));
        System.out.println("Total tip: "+tip);
        System.out.println("Total per person: "+perperson);
        System.out.println("Tip per person: "+tipperperson);




    }
}