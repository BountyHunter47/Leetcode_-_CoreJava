import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1560 {
    public static void main(String[] args) {
        System.out.println(mostVisited(4, new int[] {1,3,1,2}));
    }

    private static List<Integer> mostVisited(int n, int[] nums) {
        int[] freq = new int[n+1];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length-1; i++) {
            int tmp = nums[i];
            while (tmp != nums[i+1]) {
                if (tmp >= freq.length) {
                    tmp = 1;
                    continue;
                }
                freq[tmp]++;
                max = Math.max(freq[tmp], max);
                tmp++;
            }
        }
        freq[nums[nums.length-1]]++;
        max = Math.max(freq[nums[nums.length-1]], max);
        System.out.println(Arrays.toString(freq));
        System.out.println(max);

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < freq.length; i++) if (freq[i] == max) list.add(i);

        return list ;
    }
}
