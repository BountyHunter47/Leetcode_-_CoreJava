import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Q2287 {
    public static void main(String[] args) {
        System.out.println(rearrangeCharacters("ilovecodingonleetcode", "code"));
    }
    public static int rearrangeCharacters(String s, String target) {
        int ans = Integer.MAX_VALUE;
        Map<Character, Integer> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < target.length(); i++) {
            set.add(target.charAt(i));
        }

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        int idx = 0;
        for (int i : map.keySet()) {
            if (idx >= target.length()) break;
            if (!map.containsKey(target.charAt(idx))){
                return 0;
            }else {
                ans = Math.min(map.get(target.charAt(idx)), ans);
            }
            idx++;
        }
        return ans;
    }
}
