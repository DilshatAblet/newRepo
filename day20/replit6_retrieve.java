package day20;
import java.util.Scanner;
public class replit6_retrieve {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();

        int senderstart = message.indexOf("<");
        int senderend = message.indexOf(">");
        String sender = message.substring(senderstart+1,senderend);
        int phoneStart = message.indexOf("[");
        int phoneEnd = message.indexOf("]");
        String phoneNumber = message.substring(phoneStart+1,phoneEnd);
        int bodyStart = message.indexOf("{");
        int bodyEnd = message.indexOf("}");
        String messageBody = message.substring(bodyStart+1,bodyEnd);


        System.out.println("Sender: "+sender);
        System.out.println("Phone Number: "+phoneNumber);
        System.out.println("Message body: "+messageBody);



    }
}
