import java.util.Arrays;

public class Q1769 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(minOperation("110")));
    }

    private static int[] minOperation(String s) {
        int[] nums = new int[s.length()];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = getNums(nums, s, i);
        }

        return nums;
    }

    private static int getNums(int[] nums, String s, int idx) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) if (s.charAt(i) == '1') ans += Math.abs(idx - i);
        return ans;
    }
}
