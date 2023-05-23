import java.util.ArrayList;
import java.util.List;

public class Q39 {
    public static void main(String[] args) {
        System.out.println(combinationSum(new int[] {2,3,6,7}, 7));

    }
    static List<List<Integer>> list = new ArrayList<>();
    private static List<List<Integer>> combinationSum(int[] nums, int k) {
        getCombination(0, nums, new ArrayList<Integer>(), k);
        return list;
    }

    private static void getCombination(int i, int[] nums, ArrayList<Integer> tmp, int k) {
        if (k < 0 || i >= nums.length) return;
        if (k == 0) {
            list.add(new ArrayList<>(tmp));
            return;
        }
        tmp.add(nums[i]);
        getCombination(i, nums, tmp, k -nums[i]);
        if (!tmp.isEmpty())tmp.remove(tmp.size()-1);
        getCombination(i+1, nums, tmp, k);
    }
}
