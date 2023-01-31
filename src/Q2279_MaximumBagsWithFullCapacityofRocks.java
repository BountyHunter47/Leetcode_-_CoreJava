import java.lang.reflect.Array;
import java.util.Arrays;

public class Q2279_MaximumBagsWithFullCapacityofRocks {
    public static void main(String[] args) {
        int[] rocks ={1,2,4,4};
        int[] cap = {2,3,4,5};
        int add = 2;
        System.out.println(maximumBags(rocks,cap,add));
    }

    private static int maximumBags(int[] rocks, int[] cap,int add) {
        for (int i = 0; i < cap.length; i++) {
            rocks[i] = cap[i] - rocks[i];
        }

        Arrays.sort(rocks);
        System.out.println(Arrays.toString(rocks));
        int sum = 0;
        int ans = 0;
        for(int i : rocks){
            sum += i;
            if(sum >= add) break;
            ans++;
        }
        return ans;
    }
}
