import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q1713 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(restoreArray(new int[][]{{2, 1}, {3, 4}, {3, 2}})));
    }

    private static int[] restoreArray(int[][] mat) {
        int[] ans = new int[mat.length +1];
        int idx = 0;
        int find = 0;
        Map<Integer, Integer> zeroMap = new HashMap<>();
        Map<Integer, Integer> oneMap = new HashMap<>();

        Map<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < mat.length; i++) {
            if (zeroMap.containsKey(mat[i][0])) {
                oneMap.put(mat[i][0], mat[i][1]);
            }
            else {
                zeroMap.put(mat[i][0], mat[i][1]);
            }
            freq.put(mat[i][0], freq.getOrDefault(mat[i][0], 0) +1);
            freq.put(mat[i][1], freq.getOrDefault(mat[i][1], 0) +1);
        }
        for (int i = 0; i < mat.length; i++){
            if (oneMap.containsKey(mat[i][1])) {
                zeroMap.put(mat[i][1], mat[i][0]);
            }
            else {
                oneMap.put(mat[i][1], mat[i][0]);
            }
        }

        for (int i : freq.keySet()) {
            if (freq.get(i) == 1) {
                ans[idx++] = i;
                find = i;
                break;
            }
        }
        while (idx < ans.length) {
            if (oneMap.containsKey(find)) {
                ans[idx++] = oneMap.get(find);
                find = oneMap.get(find);
            }
            else if (zeroMap.containsKey(find)) {
                ans[idx++] = zeroMap.get(find);
                find = zeroMap.get(find);
            }
        }
        return ans;
    }
}
