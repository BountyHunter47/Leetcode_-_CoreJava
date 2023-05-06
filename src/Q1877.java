import java.util.HashMap;
import java.util.Map;

public class Q1877 {
    public static void main(String[] args) {
        System.out.println(minPairSum(new int[] {3,5,4,2,4,6}));
    }

    private static int minPairSum(int[] nums) {
        Map<Integer, Integer> map  =new HashMap<>();

        for (int i : nums) map.put(i, map.getOrDefault(i, 0) + 1);

        int ans = 0;
        int tmp = 0;
        for (int i : map.keySet()) {
            int val = map.get(i);
            if (val % 2 == 0) ans = Math.max(ans, (i*2));
            if (val == 1) {
                if (tmp == 0) tmp += i;
                else {
                    tmp += i;
                    ans = Math.max(ans, tmp);
                    tmp = 0;
                }
            }
            if (val > 1 && val % 2 != 0) {
                ans = Math.max(ans, (i * 2));
                if (tmp == 0) tmp += i;
                else {
                    tmp += i;
                    ans = Math.max(ans, tmp);
                    tmp = 0;
                }
            }
        }

        return ans;
    }
}
