import java.util.Arrays;

public class Q1619 {
    public static void main(String[] args) {
        System.out.println(trimMean(new int[]{1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3}));
    }
    public static double trimMean(int[] arr) {
        Arrays.sort(arr);
        var per = (arr.length * 5) / 100;
        int sum = 0;
        for (int i = per; i < arr.length-per; i++) {
            sum += arr[i];
        }
        return (double) sum/ (arr.length - (per*2));
    }
}
