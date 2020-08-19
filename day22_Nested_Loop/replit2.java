package day22_Nested_Loop;

import java.util.Scanner;

public class replit2 {
    public static void main(String[] args) {
        double price = 0;
        String storageType, screenType, cpu, resolution;
        int ram = 0 ;
        int screensize;
        Scanner scan = new Scanner(System.in);
        //WRITE YOUR CODE HERE
        System.out.println("Select screen size:");
        screenType = scan.next();
        System.out.println("Select CPU type:");
        cpu = scan.next();
        System.out.println("Select RAM size:");
        ram = scan.nextInt();
        System.out.println("Select storage type:");
        storageType = scan.next();
        System.out.println("Enter memory size:");
        screensize = scan.nextInt();
        System.out.println("Enter screen resolution:");
        resolution = scan.next();
        if(screensize==13.3){ price += 200; }
        else if(screensize==15){price+=300; }
        else if(screensize==17.3){price+=400;}
        switch(cpu){
            case "i3":
                price +=150;
                break;
            case "i5":
                price +=250;
                break;
            case "i7":
                price +=350;
                break;
        }
        //ram
        price = price + (ram/4)*50;
        if(storageType.equals("HDD")){
            price += (screensize/500)*50;
        } else if(storageType.equals("SSD")){
            price += (screensize/500)*100;
        }
        switch(resolution){
            case "FULLHD":
                price +=100;
                break;
            case "4K":
                price +=200;
                break;
        }
        System.out.println("Laptop price is: $"+price);
    }
    }
