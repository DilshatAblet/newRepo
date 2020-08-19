package day22_Nested_Loop;

import java.util.Scanner;

public class replit_computer {
    public static void main(String[] args) {

        double price = 0;
        String storageType, screenType, cpu;
        int ram = 0 ;
        Scanner scan = new Scanner(System.in);
        //WRITE YOUR CODE HERE
        double screensize;
        int memorySize;
        System.out.println("Select screen size:");
        screensize = scan.nextDouble();

        System.out.println("Select CPU type:");
        cpu =scan.next();

        System.out.println("Select RAM size:");
        ram = scan.nextInt();

        System.out.println("Select storage type:");
        storageType = scan.next();

        System.out.println("Enter memory size:");
        memorySize = scan.nextInt();

        System.out.println("Enter screen resolution:");
        screenType = scan.next();

        if(screensize==13.3){ price += 200; }
        else if(screensize==15){price+=300; }
        else if(screensize==17.3){price+=400;}

        if(cpu.equals("i3")){ price +=150; }
        else if(cpu.equals("i5")){price += 250;}
        else if(cpu.equals("i7")){price += 350;}

        price+= ram/4*50;

        if(storageType.equals("SSD")){price += memorySize/500*100;}
        else if(storageType.equals("HDD")){price += memorySize/500*50;}

        if(screenType.equals("FULLHD")){price+=100;}
        else if(screenType.equals("4K")){price+=200;}


        System.out.println("Laptop price is: $"+price);








    }
}
