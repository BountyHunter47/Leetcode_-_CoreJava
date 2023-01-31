public class SecondLargest {
    public static void main(String[] args) {
        int[] nums = {269,269,269,269,269,269,269,183};
        System.out.println(findSecondLargest(nums));
    }

    private static int findSecondLargest(int[] nums) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        if(nums[0] > nums[1]) {
            first = nums[0];
            second = nums[1];
        }
        else {
            second = nums[0];
            first = nums[1];
        }

        for (int i = 2; i < nums.length; i++){
            if(nums[i] > first){
                second = first;
                first = nums[i];
            } else if (nums[i] < first) {
                if (first == second) second = nums[i];
                else if ( nums[i] > second) second = nums[i];
            }
        }

        return second;
    }
}
