import java.util.Arrays;

public class Q985 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumEvenAfterQueries(new int[]{1, 2, 3, 4}, new int[][]{{1, 0}, {-3, 1}, {-4, 0}, {2, 3}})));
    }

    private static int[] sumEvenAfterQueries(int[] nums, int[][] q) {
        int ans = 0;
        for (int i : nums) if (i % 2 == 0) ans += i;

        int[] arr = new int[q.length];
        for (int i = 0; i < q.length; i++) {
            int index = q[i][1], val = q[i][0];
            int tmp = nums[index] + val;
            if (nums[index] % 2 == 0 && tmp % 2 == 0) ans += val;
            if (nums[index] % 2 != 0 && tmp % 2 == 0) ans += tmp;
            if (nums[index] % 2 == 0 && tmp % 2 != 0) ans -= nums[index];
            nums[index] += val;
            arr[i] = ans;
        }
        return arr;
    }
}
