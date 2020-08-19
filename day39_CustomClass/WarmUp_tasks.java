package day39_CustomClass;

import java.lang.reflect.AccessibleObject;

public class WarmUp_tasks {
//    BanckAccount:
//    Attributes:
//    accountName, AccountNumber, Balcance
//    Actions:
//    setInfo, withdraw, deposist, checkAvailableBalance
//    jobOffer:
//    Attributes:
//    Location, hasBenifit(boolean), salary, WFH(boolean), JobTitle
//    Actions:
//    SetInfo, getInfo
//    create a class named MyOffers
//        1. create 7 objects Offer Class and store them into an arraylist
//        2. write a program that can only keep the offers from local area
//        3. write program that can remove all the offers that are not SDET or QA
//        4. write a program that can remove all the offers that are not WFH
//        5. write a program that can remove all the offers that do not have benifits
//Warmup tasks:
//    Task1
//    create a custom class for BankAccount
//    attributes/data that can have are:
//            1. AccountHolder, 2. AccountNumber, 3. Balance
//    Actions: showBalance, deposit, withdraw
//    requiremnts:
//            1. user should be able to deposit money into their account
//            2. user should be able to withdraw money from their account
//                2.1 if the withdrawing account is greater than available balance, 35$ penalty charge will be added
//                2.2 if the balance is less than or equal to 0, user should not be able to withdraw money
//            3. user should be able to see their balance
//    Task2:
//            1. create a custom class for the carpet class that should contain the following:
//
//    instance variables:
//    width, length, unitPrice, isPersian (boolean)
//    instance methods:
//    customOrder(): sets the carpet' width, length, unitprice, & isParsian
//    calcCost(): should be able to caculate the total cost of the carpet and return it as double
//    getCarpetInfo: should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()
//    total price of carpet= (width*length)*unitprice
//            if the carpet is persian  carpet that's came from Turkey, add 200$ to the totalPrice
//    create a class called carpetObjects, and create an array of the carpet that contains 5 carpet objects ( make sure you set the instance variables of those objets)
//    create two ArrayList of carpets:
//    persianCarpets
//            reugularCarpets
//    write a program to store all the persian Carpets into the list of persianCarpets, and store all regular carpets into the list of reugularCarpets
//    use for each loop to print out all the persian carpets

    String name;
    int ACNumber;
    double ACBalance;


public void bankAccount (String accountName ,int accountNumber,double balance){
    name =accountName;
    ACNumber = accountNumber;
    ACBalance =balance;

}

public void withdraw(double withdraw){
    System.out.println("balance is: "+(ACBalance-withdraw));
}
public void  deposit(double deposit){
    System.out.println("balance is: "+(ACBalance+deposit));
}
public void balance (){
    System.out.println("balance is: "+ACBalance);
}











}
