import java.util.ArrayList;
import java.util.List;

public class Utils {

    public static void mergeSortInAscending(int[] nums) {
        mergerSort(nums, 0, nums.length-1);
    }

    private static void mergerSort (int[] nums, int low, int high) {
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
            if (nums[left] <= nums[right]) tmp.add(nums[left++]);
            if (nums[right] <= nums[left]) tmp.add(nums[right++]);
        }

        while (left <= mid) tmp.add(nums[left++]);
        while (right < high) tmp.add(nums[right++]);

        for (int i = low; i < high; i++) nums[i] = tmp.get(i -low);
    }

    public static void quickSortInAscending(int[] nums) {
        quickSort(nums, 0, nums.length-1, 1);
    }

    public static void quickSortInDescending(int[] nums) {
        quickSort(nums, 0, nums.length-1, 0);
    }

    private static void quickSort(int[] nums, int low, int high, int order) {
        if (low >= high)return;
        int pivot = f(nums, low, high, order);
        quickSort(nums, low, pivot-1, order);
        quickSort(nums, pivot+1, high, order);
    }

    private static int f(int[] nums, int low, int high, int order) {
        int pivot = nums[low];
        int i = low, j = high;

        while (i < j) {
            if (order == 1) {
                while (i <= j && nums[i] <= pivot) i++;
                while (i <= j && nums[j] > pivot) j--;
            }else {
                while (i <= j && nums[i] >= pivot) i++;
                while (i <= j && nums[j] < pivot) j--;
            }
            if (i < j) Utils.swapInt(nums, i, j);
        }
        Utils.swapInt(nums, low, j);
        return j;
    }

    public static int[] loweCaseFreq(char[] nums) {
        int[] freq = new int[26];
        for (char ch : nums) freq[ch - 'a']++;
        return freq;
    }
    public static int[] loweCaseFreq(String s) {
        int[] freq = new int[26];
        for (char ch : s.toCharArray()) freq[ch - 'a']++;
        return freq;
    }
    public static int[] upperCaseFreq(char[] nums) {
        int[] freq = new int[128];
        for (char ch : nums) freq[ch]++;
        return freq;
    }
    public static int[] upperCaseFreq(String s) {
        int[] freq = new int[128];
        for (char ch : s.toCharArray()) freq[ch]++;
        return freq;
    }
    public static boolean isVowel(char ch) {
        return (ch == 'a' || ch == 'e' || ch == 'o' || ch == 'i' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'O' || ch == 'I' || ch == 'U');
    }
    public static void swapInt(int[] nums, int i, int j) {
        try {
            int tmp = nums[j];
            nums[j] = nums[i];
            nums[i] = tmp;
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bound");
        }
    }
    public static void swapChar(char[] arr, int i, int j) {
        try {
            char tmp = arr[j];
            arr[j] = arr[i];
            arr[i] = tmp;
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bound");
        }
    }

}
