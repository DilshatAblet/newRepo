package day29_customMethods;

public class uniques {
    public static void main(String[] args) {

        String[] arr ={"A","B","B","C"};
        for(String a:arr) {
            int count = 0;

            for (String each : arr) {
                if (a.equals(each)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(a+" ");
            }

        }


    }
}
