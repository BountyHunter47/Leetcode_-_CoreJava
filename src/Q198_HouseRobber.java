public class Q198_HouseRobber {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(rob(nums));
    }

    private static int rob(int[] nums) {
        int rob1 = 0;
        int rob2 = 0;

        for(int i = 0; i < nums.length; i++) if(i % 2 == 0) rob1 += nums[i];
        for(int j = 0; j < nums.length; j++) if (j % 2 != 0) rob2 += nums[j];


        return Math.max(rob1,rob2);
    }
}
