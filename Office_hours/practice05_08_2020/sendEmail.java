package Office_hours.practice05_08_2020;
import Library.Util;

public class sendEmail {

    /*
                first Step:
                    go to  :
                         https://myaccount.google.com/lesssecureapps?utm_source=google-account&utm_medium=web
                            Make sure that your google account allows third part app
     */
    public static void main(String[] args) {
        // credentials
        String userName = "dilxat856988@gmail.com";
        String passWord = "Longines856988";
        // email:
        String[] receivers = {"dilxat8569@yahoo.com"};
        String subject = "test email";
        String text = "this is the testing email.";
        int times = 1;
        int count  = 1;
        while(times > 0){ //send the email multiple time
            for( String each : receivers ){  // for sending emails to multiple people
                System.out.println("Sending to: "+each  );
                Util.sendEmails(userName,passWord,each, subject,text);
            }
            System.out.println(count++);
            times--;
        }
        System.out.println("Completed");
    }

}
