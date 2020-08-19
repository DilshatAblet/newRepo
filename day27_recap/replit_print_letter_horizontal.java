package day27_recap;

import java.util.Scanner;

public class replit_print_letter_horizontal {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            String[] arr = new String[6];
            for (int i=0;i<6;i++){
                arr[i] = input.nextLine();
            }

        for(int i =0; i<=2;i++){
            System.out.print(arr[i]+" , ");
            i++;
            System.out.print(arr[i]+" , ");
            i++;
            System.out.println(arr[i]);
        }
        for(int j =1;j<=3;j++){
            System.out.print(arr[j]+" , ");
            j++;
            System.out.print(arr[j]+" , ");
            j++;
            System.out.println(arr[j]);
        }
        for(int k =2;k<=4;k++){
            System.out.print(arr[k]+" , ");
            k++;
            System.out.print(arr[k]+" , ");
            k++;
            System.out.println(arr[k]);
        }
        for(int l =3;l<=5;l++){
            System.out.print(arr[l]+" , ");
            l++;
            System.out.print(arr[l]+" , ");
            l++;
            System.out.println(arr[l]);
        }





    }
}
