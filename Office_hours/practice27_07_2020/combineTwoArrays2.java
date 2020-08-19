package Office_hours.practice27_07_2020;

import java.util.Arrays;

public class combineTwoArrays2 {
    public static void main(String[] args) {

        String[] a1 = {"Tetiana","Hamit","Phornsri"}; //3
        String[] a2 = {"Aaloa","Zaki","Cristina","Dawut"}; //3

        String[] a3 = new String[a1.length+a2.length];

        for(int i=0;i<=a1.length-1;i++){
            a3[i]=a1[i];
        }

        for(int i = 0;i<=a2.length-1;i++){
            a3[i+a1.length]=a2[i];
        }

        System.out.println(Arrays.toString(a3));






    }
}
