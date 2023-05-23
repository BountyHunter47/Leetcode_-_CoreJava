import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q40 {
    public static void main(String[] args) {
        System.out.println(combinationSum(new int[] {2,5,2,1,2}, 5));
    }

    private static List<List<Integer>> combinationSum(int[] nums, int k) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        findCombination(0, nums, k, list, new ArrayList<>());
        return list;
    }

    private static void findCombination(int ind, int[] nums, int k, List<List<Integer>> list, List<Integer> tmp) {
        if (k == 0) {
            list.add(new ArrayList<>(tmp));
            return;
        }

        for (int i = ind; i < nums.length; i++) {
            if (i > ind && nums[i] == nums[i-1]) continue;
            if (nums[i] > k) break;

            tmp.add(nums[i]);
            findCombination(i + 1, nums, k -nums[i], list, tmp);
            tmp.remove(tmp.size()-1);
        }
    }
}
