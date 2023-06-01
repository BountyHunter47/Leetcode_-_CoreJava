import java.util.Arrays;

public class Q1652 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(decrypt(new int[]{5, 7, 1, 4}, -2)));
    }

    private static int[] decrypt(int[] nums, int k) {
        int[] ans = new int[nums.length];
        if (k == 0) return ans;
        for (int i = 0; i < nums.length; i++) {
            int tmp = k, idx = i+1;
            int sum = 0;
            if (k < 0) {
                idx = i -1;
                while (tmp != 0) {
                    if (idx < 0) idx = nums.length -1;
                    sum += nums[idx--];
                    tmp++;
                }
            }
            else {
                while (tmp != 0) {

                    sum += nums[idx++ % nums.length];
                    tmp--;
                }
            }
            ans[i] = sum;
        }
        return ans;
    }
}
