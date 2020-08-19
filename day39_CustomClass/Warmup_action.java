package day39_CustomClass;

public class Warmup_action {

    public static void main(String[] args) {

    WarmUp_tasks person1 =new WarmUp_tasks();
    WarmUp_tasks person2 =new WarmUp_tasks();
    WarmUp_tasks person3 =new WarmUp_tasks();
    WarmUp_tasks person4 =new WarmUp_tasks();


    person1.bankAccount("john",1002983,190580.5);
    person2.bankAccount("lilia",1029394,493.9);
    person3.bankAccount("dil",10834937,108757);
    person4.bankAccount("Muhtar",10389573,47475.3);

    person1.balance();
    person2.deposit(30900);
    person3.withdraw(50000);
    person4.withdraw(300);


        System.out.println("============================================");

    


    }
}
