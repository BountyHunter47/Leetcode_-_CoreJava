import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = {1,2,4,2,4,5};
//        mergerSort(nums, 0, nums.length-1);
        Utils.mergeSortInAscending(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void mergerSort (int[] nums, int low, int high) {
        if (low >= high) return;
        int mid = (low + high) /2;
        mergerSort(nums, low, mid);
        mergerSort(nums, mid+1, high);
        merge(nums, low, mid, high);
    }

    private static void merge(int[] nums, int low, int mid, int high) {
        int left = low, right = mid +1;
        List<Integer> tmp =new ArrayList<>();
        while (left <= mid && right < high) {
            if (nums[left] <= nums[right]) {
                tmp.add(nums[left++]);
            }
            if (nums[right] <= nums[left]) {
                tmp.add(nums[right++]);
            }
        }

        while (left <= mid) tmp.add(nums[left++]);
        while (right < high) tmp.add(nums[right++]);

        for (int i = low; i < high; i++) {
            nums[i] = tmp.get(i -low);
        }
    }

}
