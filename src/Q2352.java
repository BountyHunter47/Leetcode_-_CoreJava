import java.util.*;

public class Q2352 {
    public static void main(String[] args) {
        System.out.println(equalPair(new int[][] {{3,2,1}, {1,7,6}, {2,7,7}}));
    }

    private static int equalPair(int[][] mat) {
        Map<String, Integer> map = new HashMap<>();
        int ans = 0;
        for (int[] i : mat){
            String tmp = "";
            for (int val : i) tmp += val+" ";
            map.put(tmp, map.getOrDefault(tmp, 0) +1);
        }
        for (int i = 0; i < mat[0].length; i++) {
            String tmp = "";
            for (int j = 0; j < mat.length; j++) {
                tmp += mat[j][i] + " ";
            }
            if (map.containsKey(tmp)) {
                ans += map.get(tmp);
            }
        }
        System.out.println(map);
        return ans;
    }
}
