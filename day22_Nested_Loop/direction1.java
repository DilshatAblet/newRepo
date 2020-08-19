package day22_Nested_Loop;
import java.util.Scanner;
public class direction1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String start = scan.next();
        String end = scan.next();

        String result ="";
        if(start.equals(end)) {
            result = end + " found";
        }else if(start.equalsIgnoreCase("A")){
            switch (end){
                case "B": result ="right: B found";
                    break;
                case "C": result ="right > down: C found ";
                    break;
                case "D": result ="right > down > left: D found";
                    break;
            }
        }
        else if(start.equalsIgnoreCase("B")){
            switch (end){
                case "C": result ="down: C found";
                    break;
                case "D": result ="down > left: D found";
                    break;
                case "A": result ="down > left > up: A found";
                    break;
            }
        }
        else if(start.equalsIgnoreCase("C")){
            switch (end){
                case "D": result ="left: D found";
                    break;
                case "A": result ="left > up: A found";
                    break;
                case "B": result ="left > up > right: B found";
                    break;
            }
        }
        else if(start.equalsIgnoreCase( "D")) {
            switch (end) {
                case "A":
                    result = "up: A found";
                    break;
                case "B":
                    result = "up > right: B found";
                    break;
                case "C":
                    result = "up > right > down: C found";
                    break;}
        }
        System.out.println(result);
    }
}