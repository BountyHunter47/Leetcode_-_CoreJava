import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1200 {
    public static void main(String[] args) {
        int nums[] = {3,8,-10,23,19,-4,-14,27};
        System.out.println(minimumAbsDifference(nums));
    }

    public static List<List<Integer>> minimumAbsDifference(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        int tmp = Integer.MAX_VALUE;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i+1] - nums[i] < tmp) tmp = nums[i+1] - nums[i];
        }

        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i+1] - nums[i] == tmp) {
                List<Integer> tmpList = new ArrayList<>();
                tmpList.add(nums[i]);
                tmpList.add(nums[i+1]);
                list.add(tmpList);
            }
        }
        System.out.println(tmp);
        return list;
    }
}
