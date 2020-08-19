package day22_Nested_Loop;

import java.util.Scanner;

public class replit_realestate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your property type:");
        String houseType = scan.nextLine();
        System.out.println("How many bedrooms do you have?");
        int numberOfBedrooms = scan.nextInt();
        System.out.println("Do you have a backyard?");
        boolean backyard = scan.nextBoolean();
        System.out.println("Do you have garage?");
        boolean garage = scan.nextBoolean();
        if(garage==true){
            System.out.println("How many spots?");
            int garageSpots = scan.nextInt();
        }
        System.out.println("How many spots?");
        int garageSpots = scan.nextInt();
        System.out.println("How close is metro station?");
        float metroAccessibility = scan.nextFloat();
        System.out.println("How close is highway?");
        float highwayAccessibility = scan.nextFloat();
        System.out.println("What's the rating of nearest school?");
        float schoolScore = scan.nextFloat();
        System.out.println("Does any of your family members smoking?");
        boolean smoking = scan.nextBoolean();
        int totalprice = 0;

        if(houseType.equalsIgnoreCase("condo")){
            totalprice += 50000;
        } else if(houseType.equalsIgnoreCase("Townhouse")){
            totalprice+=75000;
        } else if(houseType.equalsIgnoreCase("SingleFamilyHome")){totalprice+=95000;
        }
        if(numberOfBedrooms>0){
            totalprice+=numberOfBedrooms*30000;
        }
        if(backyard==true){
            totalprice+=5000;
        }else{
            System.out.println("Backyard is not available for condo!");
        }
        if(garageSpots>0&&garageSpots<10) {
            totalprice += garageSpots * 20000;
        }else{
            System.out.println("Pardon,  it's not a public parking!");
        }
        if(metroAccessibility>1&&metroAccessibility<3){
            totalprice+=5000;
        }else if(metroAccessibility<=1){
            totalprice+=10000;
        }
        if(highwayAccessibility<=1){
            totalprice+=15000;
        }else if(highwayAccessibility>1&&highwayAccessibility<=5){
            totalprice+=8000;
        }else if(highwayAccessibility>5&&highwayAccessibility<=20){
            totalprice+=4000;
        }
        if(schoolScore>=8&&schoolScore<=10){
            totalprice+=45000;
        }else if(schoolScore<8&&schoolScore>4){
            totalprice+=20000;
        }else{
            totalprice+=5000;
        }
        if(smoking==true){
            totalprice-=5000;
        }
        System.out.println("Market report has been generated.");
        System.out.println("Your estimate market price is:"+totalprice);









    }
}
