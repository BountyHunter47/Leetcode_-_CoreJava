import java.util.Arrays;

public class Q1475 {
    public static void main(String[] args) {
        int[] nums = {8,4,6,2,3};
        System.out.println(Arrays.toString(finalPrices(nums)));
    }

    public static int[] finalPrices(int[] prices) {
        for(int i = 0; i < prices.length-1; i++){
            for(int j = i+1; j < prices.length; j++){
                if(prices[j] <= prices[i]) {
                    prices[i] = prices[i] - prices[j];
                    break;
                }
            }
        }
        return prices;
    }
}
