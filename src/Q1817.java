import java.util.*;

public class Q1817 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findingUserActiveMinutes(new int[][]{{0, 5}, {1, 2}, {0, 2}, {0, 5}, {1, 3}}, 5)));
    }

    private static int[] findingUserActiveMinutes(int[][] mat, int k) {
        Map<Integer, Set<Integer>> map = new HashMap<>();

        for (int i = 0; i < mat.length; i++) {
            if (map.containsKey(mat[i][0])) {
                Set<Integer> tmp = map.get(mat[i][0]);
                tmp.add(mat[i][1]);
                map.put(mat[i][0], tmp);
            }else {
                Set<Integer> tmp = new HashSet<>();
                tmp.add(mat[i][1]);
                map.put(mat[i][0], tmp);
            }
        }
        int[] ans = new int[k];

        for (int i : map.keySet()) {
            Set<Integer> tmp = map.get(i);
            if (tmp.size() > 0) ans[tmp.size()-1]++;
        }

        return ans;
    }
}

