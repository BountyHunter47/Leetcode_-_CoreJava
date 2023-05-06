import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q2375 {
    public static void main(String[] args) {
        System.out.println(smallestNumber("DDD"));
    }

    private static String smallestNumber(String s) {
        int[] nums = new int[s.length()+1];
        for (int i = 0; i < nums.length; i++) nums[i] = i+1;

        for (int i = 0; i < s.length(); i++) {
            int start = 0, end = 0;
            if (s.charAt(i) == 'D') {
                start = i;
                while (i < s.length() && s.charAt(i) == 'D') i++;
                end = i;
                i--;
                while (start <= end) {
                    int tmp = nums[end];
                    nums[end--] = nums[start];
                    nums[start++] = tmp;
                }
            }
        }
        String ans = "";
        for (int i : nums) ans += i+"";
        return ans;
    }
}
