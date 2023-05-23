public class Q1004 {
    public static void main(String[] args) {
        System.out.println(longestOnes(new int[]{0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}, 3));
    }

    private static int longestOnes(int[] nums, int k) {
        int ans = 0;
        int left =0, right =0;
        int ones = k;
        while (right < nums.length) {
            while (right < nums.length && (nums[right] == 1 || ones > 0)) {
                if (nums[right++] == 0) ones--;
            }
            ans = Math.max(right - left, ans);
            while (left < nums.length && ones == 0) {
                if (nums[left++] == 0) ones++;
            }
        }
        return ans;
    }
}
