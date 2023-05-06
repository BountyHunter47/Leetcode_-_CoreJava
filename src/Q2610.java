import java.util.*;

public class Q2610 {
    public static void main(String[] args) {
        System.out.println(findMatrix(new int[] {1,3,4,1,2,3,1}));
    }

    private static List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) map.put(i, map.getOrDefault(i, 0) + 1);

        int tmp = 0;
        while (tmp != map.size()) {
            tmp = 0;
            List<Integer> tmpList = new ArrayList<>();
            for (int i : map.keySet()) {
                if (map.get(i) > 0) {
                    tmpList.add(i);
                    map.put(i, map.get(i)-1);
                } else tmp++;
            }
            if (!tmpList.isEmpty()) ans.add(tmpList);
        }

        return ans;
    }
}
