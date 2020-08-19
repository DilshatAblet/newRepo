package day14_recap;

import java.util.Scanner;

public class replit1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Item1, count and its price:");
        String item1 = scan.next();
        int count1 = scan.nextInt();
        double price1 = scan.nextDouble();
        double totalprice1 = count1*price1;

        System.out.println("Enter Item2, count and its price:");
        String item2 = scan.next();
        int count2 = scan.nextInt();
        double price2 = scan.nextDouble();
        double totalprice2 = count2*price2;

        System.out.println("Enter Item3, count and its price:");
        String item3 = scan.next();
        int count3 = scan.nextInt();
        double price3 = scan.nextDouble();
        double totalprice3 = count3*price3;

        if(count1==0){
            System.out.println("Item2: "+item2+" Price: "+totalprice2+", Item3: "+item3+" Price: "+totalprice3);
            System.out.println("Total price: "+(totalprice2+totalprice3));
        }else if (count2==0){
            System.out.println("Item1: "+item1+" Price: "+totalprice1+", Item3: "+item3+" Price: "+totalprice3);
            System.out.println("Total price: "+(totalprice1+totalprice3));
        }else if(count3==0){
            System.out.println("Item1: "+item1+" Price: "+totalprice1+", Item2: "+item2+" Price: "+totalprice2);
            System.out.println("Total price: "+(totalprice1+totalprice2));
        }else{
            System.out.println("Item1: "+item1+" Price: "+totalprice1+", Item2: "+item2+" Price: "+totalprice2+
                    ", Item3: "+item3+" Price: "+totalprice3);
            System.out.println("Total price: "+(totalprice1+totalprice2+totalprice3));
        }










    }
}
