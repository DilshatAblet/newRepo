package day08_LogicalOperator;

public class gallon_liter {
    public static void main(String[] args) {
        /*1 gallon = 3.785 liters
        1 liter = 1/3.785 */

        double gallons=20;
        double liter =gallons * 3.785;

        System.out.println(liter);

        float liters = 200f;
        float gallons1 = liters/3.785f;
        System.out.println(gallons1);




    }
}
