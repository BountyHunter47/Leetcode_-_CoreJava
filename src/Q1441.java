import java.util.ArrayList;
import java.util.List;

public class Q1441 {
    public static void main(String[] args) {
        System.out.println(buildArray(new int[] {1,3}, 3));
    }

    private static List<String> buildArray(int[] nums, int n) {
        int i = 0;
        List<String> ans = new ArrayList<>();
        int streamer =1;
        while (i < nums.length) {
            ans.add("Push");
            if (nums[i] != streamer) ans.add("Pop");
            else i++;
            streamer++;
        }
        return ans;
    }
}
