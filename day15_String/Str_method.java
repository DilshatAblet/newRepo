package day15_String;

public class Str_method {
    public static void main(String[] args) {

        String name = "Cybertek School";
        char ch1 = name.charAt(0);
        System.out.println(ch1);


        int l = name.length();
        System.out.println(l);
        int indexNumber = l-1;
        System.out.println(indexNumber);
        char lastchar = name.charAt(indexNumber);
        System.out.println(lastchar);

        System.out.println("===========================================");

        String name1 = "CYBERTEK SCHOOL";
        name1 = name1.toLowerCase();
        System.out.println(name1);

        String name2 = "cybertek school";
        name2 = name2.toUpperCase();
        System.out.println(name2);


    }
}
