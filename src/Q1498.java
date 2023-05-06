import java.util.Arrays;

public class Q1498 {
    public static void main(String[] args) {
        System.out.println(numSubSequence(new int[] {3,5,6,7}, 9));
    }

    private static int numSubSequence(int[] nums, int k) {
        Arrays.sort(nums);

        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] + nums[j] <= k) ans++;
            }
        }
        return ans;
    }
}
