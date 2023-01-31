public class Q2149_RearrangeArrayElementsbySign {
    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};
        System.out.println(rearrangeArray(nums));
    }

    private static int[] rearrangeArray(int[] nums) {
        int start = 0, end = nums.length;

        while(start < end){
            if(start % 2 == 0 && nums[start] < 0 && nums[end] >= 0){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            } else if (start % 2 == 0 && nums[start] < 0 && nums[end] < 0) {
                end--;
            } else if (start % 2 == 0 && nums[start] >= 0 ) {
                start++;
            } else if (start % 2 != 0 && nums[start] >= 0 && nums[end] < 0) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            } else if (start % 2 != 0 && nums[start] < 0 ) {
                start++;
            } else if (start % 2 != 0 && nums[start] >= 0 && nums[end] >= 0) {
                end--;
            }
        }
        return nums;
    }
}
