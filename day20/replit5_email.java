package day20;
import java.util.Scanner;
public class replit5_email {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.nextLine();
        
        int index1 = email.indexOf("_");
        int index2 = email.lastIndexOf("_");
        int index3 = email.indexOf("@");
        int index4 = email.indexOf(".");
        String firstName = email.substring(0,1).toUpperCase()+ email.substring(1,index1 );
        String lastName = email.substring(index1+1,index2+2).toUpperCase()+ email.substring(index2+2,index3);

        String domain = email.substring(index3+1,index4);
        String TopLevelDomain = email.substring(index4+1);

        System.out.println("First name: "+firstName);
        System.out.println("Last name: "+lastName);
        System.out.println("Domain: "+domain);
        System.out.println("Top-Level Domain: "+TopLevelDomain);
    }
}
