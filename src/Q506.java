import java.util.*;

public class Q506 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(finalRelativeRanks(new int[]{5, 4, 3, 2, 1})));
    }

    private static String[] finalRelativeRanks(int[] nums) {
        String first = "Gold Medal";
        String second = "Silver Medal";
        String third = "Bronze Medal";

        String[] ans = new String[nums.length];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        Arrays.sort(nums);
        int rank = 1;

        for (int i = nums.length-1; i >= 0; i--) {
            if (rank == 1) {
                ans[map.get(nums[i])] = first;
                rank++;
            } else if (rank == 2) {
                ans[map.get(nums[i])] = second;
                rank++;
            } else if (rank == 3) {
                ans[map.get(nums[i])] = third;
                rank++;
            } else {
                ans[map.get(nums[i])] = rank+"";
                rank++;
            }
        }

        return ans;
    }
}
