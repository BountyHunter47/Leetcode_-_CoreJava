import java.util.HashMap;
import java.util.Map;

public class Q1726 {
    public static void main(String[] args) {
        System.out.println(tupleSameProduct(new int[] {2,3,4,6}));
    }

    private static int tupleSameProduct(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        int ans = 0;
        for (int i = 0; i < nums.length -1; i++) {
            for (int j = i +1; j < nums.length; j++) {
                if (map.containsKey(nums[i] *nums[j])) {
                    ans += 8 *map.get(nums[i] *nums[j]);
                    map.put(nums[i] *nums[j], map.get(nums[i] *nums[j]) +1);
                }
                else map.put(nums[i] *nums[j], 1);
            }
        }

        return ans;
    }
}
