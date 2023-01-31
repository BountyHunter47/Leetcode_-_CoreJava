import java.util.ArrayDeque;
import java.util.Arrays;

public class Deque {
    public static void main(String[] args) {
        int[] nums = {4,2,3};
        System.out.println(call(nums));
    }

    static boolean call(int[] nums){
        int count = 1;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] < nums[i-1]){
                nums[i] = nums[i-1]+1;
                count--;
            }
        }
        System.out.println(Arrays.toString(nums));
        return count==0 || count==1;
    }
}
