import java.util.Arrays;

public class QucikSort {
    public static void main(String[] args) {
        int[] nums = {2,1};
        quickSort(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    private static void quickSort(int[] nums, int low, int high) {
        if (low >= high)return;
        int pivot = f(nums, low, high);
        quickSort(nums, low, pivot-1);
        quickSort(nums, pivot+1, high);
    }

    private static int f(int[] nums, int low, int high) {
        int pivot = nums[low];
        int i = low, j = high;

        while (i < j) {
            while (i <= j && nums[i] >= pivot) i++;
            while (i <= j && nums[j] < pivot) j--;
            if (i < j) Utils.swapInt(nums, i, j);
        }
        Utils.swapInt(nums, low, j);
        return j;
    }
}
