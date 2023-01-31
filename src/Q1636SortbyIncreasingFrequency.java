import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class Q1636SortbyIncreasingFrequency {
    public static void main(String[] args) {
        int[] nums = {2,3,1,3,2,4,4,5,5,5};
        System.out.println(Arrays.toString(frequencySort(nums)));
    }

    private static int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i : nums)map.put(i, map.getOrDefault(i,0)+1);
        int[] keys = new int[map.size()];
        int[] values = new int[map.size()];
        int keyIdx = 0;
        int valueIdx = 0;
        System.out.println(map);
        for (int i : map.keySet()) keys[keyIdx++] = i;
        for (int i : map.values()) values[valueIdx++] = i;

        int[][] mat = new int[map.size()][2];
        for (int i = 0;i < map.size();i++){
            mat[i][0] = keys[i];
            mat[i][1] = values[i];
        }

        Arrays.sort(mat,(a,b)->b[0]-a[0]);
        Arrays.sort(mat, Comparator.comparingInt(a -> a[1]));
        System.out.println(Arrays.deepToString(mat));
        int[] ans = new int[nums.length];
        int idx = 0;
        for (int[] m : mat) {
            int freq = m[1];
            while (freq != 0) {
                ans[idx++] = m[0];
                freq--;
            }
        }

        return ans;
    }
}
