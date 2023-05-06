public class Q2221 {
    public static void main(String[] args) {
        System.out.println(triangularSum(new int[]{1,2,3,4,5}));
    }

    private static int triangularSum(int[] nums) {
        int n = nums.length-1;

        while (n != 0) {
            for (int i = 0; i < n; i++) {
                nums[i] = (nums[i] + nums[i+1]) % 10;
            }
            n--;
        }

        return nums[0];
    }
}
