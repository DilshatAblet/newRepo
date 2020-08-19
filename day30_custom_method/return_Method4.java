package day30_custom_method;

import java.util.Arrays;

public class return_Method4 {
    public static int[] combine2Arrays(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];

        int i = 0;
        for (int each : arr1) {
            arr3[i] = each;
            i++;
        }

        for (int each : arr2) {
            arr3[i] = each;
            i++;
        }

        System.out.println(Arrays.toString(arr3));

        return arr3;

    }
}
