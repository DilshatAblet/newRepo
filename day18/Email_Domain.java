package day18;
import java.util.Scanner;
public class Email_Domain {
    public static void main(String[] args) {

        /*String str =" ";
        str.trim();
        boolean A = str.isEmpty();
        System.out.println(A);*/


        Scanner scan= new Scanner(System.in);

        String email = scan.next();

        //              012345678
        int index1 = email.indexOf("@");
        int index2 = email.lastIndexOf(".");


        String domain = email.substring(index1+1, index2 );  //"gmail"

        System.out.println(domain);








    }
}
