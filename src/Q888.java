import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q888 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fairCandySwap(new int[]{2}, new int[]{1, 3})));
    }

    private static int[] fairCandySwap(int[] alice, int[] bob) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : bob) map.put(i, map.getOrDefault(i, 0 )+ 1);
        int totalAlice = 0;
        int totalBob = 0;

        for (int i : alice) totalAlice += i;
        for (int i : bob) totalBob += i;

        int sum = totalAlice + totalBob;
        int each = sum / 2;

        for (int i : alice) {
            int tmp = totalAlice -  i;
            int check = each - tmp;
            if (map.containsKey(check)) return new int[] {i, check};
        }
        return new int[0];
    }
}
