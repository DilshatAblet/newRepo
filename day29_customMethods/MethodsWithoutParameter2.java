package day29_customMethods;

public class MethodsWithoutParameter2 {
    public static void main(String[] args) {

        printHello5X();
        System.out.println("Cybertek");
        printHello5X();
        System.out.println("Muhtar");
        printHello5X();

    }




    public static void  printHello5X(){
        for(int i = 10; i >= 6; i-- ){
            System.out.println("Hello World");
        }
    }

}
