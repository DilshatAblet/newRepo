package replit_practice;

public class replit_164 {
    public double waterTax(double units) {
        double bill = 0.0;

        //your code here
        if (units <= 50&&units>0) {
            bill *= 0.6;
        } else if (units > 50 && units <= 100) {
            bill *= 0.9 + 50;
        } else if(units>100){
            bill *= 0.9 + 100;
        }
        return bill;
    }

    public static void main(String[] args) {

    }
}