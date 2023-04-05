import java.util.Arrays;

public class Q1005 {
    public static void main(String[] args) {
        System.out.println(largestSumAfterKNegations(new int[]{-8,3,-5,-3,-5,-2},6));
    }
    public static int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        var flag = false;
        for (int i = 0; i < nums.length; i++) {
            if (k == 0) break;
            if (nums[i] < 0){
                nums[i] *= -1;
                k--;
            }
            else if (k % 2 == 0) break;
            else{
                flag = true;
                break;
            }
        }

        int sum = 0;
        for (int i : nums) sum += i;
        int small = Integer.MAX_VALUE;
        if (flag || k >0) {
            for (int i : nums) small = Math.min(small,i);
            sum -= small*2;
        }
        return sum;
    }
}
