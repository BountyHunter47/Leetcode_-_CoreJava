import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Q2515 {
    public static void main(String[] args) {
        System.out.println(closetTarget(new String[]{
                "a","b","leetcode"}, "leetcode", 0));
    }
    public static int closetTarget(String[] words, String target, int startIndex) {
        int ans = Integer.MAX_VALUE;

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) if (Objects.equals(words[i], target)) list.add(i);

        for (int i : list) {
            ans = Math.min(Math.min(ans, Math.min(Math.abs(startIndex-i), (words.length-startIndex)+i)), startIndex+(words.length-i));
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
