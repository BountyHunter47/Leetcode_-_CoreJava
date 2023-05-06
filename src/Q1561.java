import java.util.Arrays;

public class Q1561 {
    public static void main(String[] args) {
        System.out.println(maxCoins(new int[] {9,8,7,6,5,1,2,3,4}));
    }

    private static int maxCoins(int[] nums) {
        int end = nums.length-1, start = 0;
        int coins = 0;

        Arrays.sort(nums);
        while (start < end) {
            end--;
            coins += nums[end--];
            start++;
        }

        return coins;
    }
}
