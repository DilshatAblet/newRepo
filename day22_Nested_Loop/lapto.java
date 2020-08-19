package day22_Nested_Loop;

import java.util.Scanner;

public class lapto {
    public static void main(String[] args) {
        double price = 0;
        String storageType, screenType, cpu;
        int ram = 0;
        Scanner scan = new Scanner(System.in);
        double screensize = 0;
        double memorySize = 0;
        System.out.println("Select screen size:");
        screensize = scan.nextDouble();
        System.out.println("Select CPU type:");
        cpu = scan.nextLine();
        scan.nextLine();
        System.out.println("Select RAM size:");
        ram = scan.nextInt();
        System.out.println("Select storage type:");
        storageType = scan.nextLine();
        scan.nextLine();
        System.out.println("Enter memory size:");
        memorySize = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter screen resolution:");
        screenType = scan.nextLine();

        switch (screenType) {
            case "13.3":
                price += 200;
                break;
            case "15.0":
                price += 300;
                break;
            case "17.3":
                price += 400;
                break;
        }
        switch (cpu) {
            case "i3":
                price += 150;
                break;
            case "i5":
                price += 250;
                break;
            case "i7":
                price += 350;
                break;
        }
        //ram
        price = price + (ram / 4) * 50;
        if (storageType.equals("HDD")) {
            price += (memorySize / 500) * 50;
        } else if (storageType.equals("SSD")) {
            price += (memorySize / 500) * 100;
        }
        switch (screenType) {
            case "FULLHD":
                price += 100;
                break;
            case "4K":
                price += 200;
                break;
        }
        System.out.println(price);
    }
}