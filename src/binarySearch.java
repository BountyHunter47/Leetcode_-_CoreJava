public class binarySearch {
    public static void main(String[] args) {
        int[] nums = {5};
        System.out.println(getTarget(nums,5));
    }

    private static int getTarget(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while(start < end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target) return mid;
            if(target > nums[mid]){
                start = mid+1;
            }
            else if(target < nums[mid]) {
                end = mid - 1;
            }
        }
        return -1;
    }
}
