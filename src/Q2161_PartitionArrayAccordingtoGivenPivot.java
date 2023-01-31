import java.util.Arrays;

public class Q2161_PartitionArrayAccordingtoGivenPivot {
    public static void main(String[] args) {
        int[] nums = {9,12,5,10,14,3,10};
        System.out.println(Arrays.toString(pivotArray(nums)));
    }

    private static int[] pivotArray(int[] nums) {
        int idx = 0;
        int pivot = 10;
        int[] ans = new int[nums.length];

        for(int i : nums) {
            if (i < pivot) {
                ans[idx++] = i;
            }
        }
        for(int i : nums)
            if(i == pivot)
                ans[idx++] = i;
        for(int i : nums)
            if(i > pivot)
                nums[idx++] = i;

        return ans;
    }
}
