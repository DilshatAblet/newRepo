package day42_static;

public class Server {

    String name;
    int employeeID;
    double hourlyRate;
    boolean fullTime;

    public void setInfo(String name,int employeeID,double hourlyRate,boolean fullTime){
        this.name = name;
        this.employeeID=employeeID;
        this.hourlyRate= hourlyRate;
        this.fullTime = fullTime;

    }

    public void takeOrder(String name){
        System.out.println(name+" is taking an order");
    }
    public void cleanTable(String name){
        System.out.println(name+" is cleaning the table");
    }
    public String toString(){
        String isFullTime = (fullTime==true)?"full-time":"part-time";
        return "name: "+name+" employee ID is: "+employeeID+" hourly rate is: $"+hourlyRate+" "+isFullTime;




    }

}
