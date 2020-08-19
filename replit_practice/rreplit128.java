package replit_practice;

public class rreplit128 {
    public static void main(String[] args) {
        int k = 0;
        double total = 0;
        double avgTemp = 0;
        double[] temps = {1,2,3,4,5,6,7,8,9,10};
        for(int i = 0;i<=temps.length-1;i++){
            total+=temps[i];
            k++;
        }
        avgTemp=total/k;
        System.out.println(avgTemp);
    }
}
