public class Q918_MaximumSumCircularSubarray {
    public static void main(String[] args) {
        int nums[] = {5,-3,5};
        System.out.println(maxSubarraySumCircular(nums));
        int max1 = maxSubarraySumCircular(nums);
        int totalSum = 0;

        for (int i = 0; i < nums.length; i-=-1) {
            totalSum += nums[i];
            nums[i] = -nums[i];
        }

        int min = maxSubarraySumCircular(nums);
        int max2 = totalSum + min;

        if(max2 == 0) System.out.println("if max 2 = 0" + max1);
        System.out.println(Math.max(max2,max1));

    }

    private static int maxSubarraySumCircular(int[] nums) {
        int ans = Integer.MIN_VALUE, curr = 0;

        for (int i = 0; i < nums.length; i++) {
            curr += nums[i];
            if(curr > ans) ans = curr;
            if(curr < 0) curr = 0;
        }

        return ans;
    }
}
