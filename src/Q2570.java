import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

public class Q2570 {
    public static void main(String[] args) {
        int[][] nums1 = {{10,2},{2,3},{4,5}};
        int[][] nums2 = {{1,4},{3,2},{4,1}};
        System.out.println(Arrays.deepToString(mergeArrays(nums1, nums2)));
    }

    public static int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        TreeMap<Integer, Integer> map = new TreeMap<>();


        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i][0], nums1[i][1]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i][0])){
                map.put(nums2[i][0],map.get(nums2[i][0])    +nums2[i][1]);
            }else{
                map.put(nums2[i][0],nums2[i][1]);
            }
        }
        System.out.println(map);
        int[][] finalArr = new int[map.size()][2];


        int idx = 0;
        for (int i : map.keySet()) {
            finalArr[idx][0] = i;
            finalArr[idx++][1] = map.get(i);
        }
        return finalArr;
    }
}
