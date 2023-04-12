import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Q2273 {
    public static void main(String[] args) {
        System.out.println(removeAnagrams(new String[]{"z","z","z","gsw","wsg","gsw","krptu"}));
    }
    public static List<String> removeAnagrams(String[] words) {
        List<String> ans = new ArrayList<>();
        int checker = 0;
        ans.add(words[0]);
        for (int i = 1; i < words.length; i++) {
            int[] curr = new int[26];
            int[] prev = new int[26];

            for (char ch : words[i].toCharArray()) curr[ch - 'a']++;
            for (char ch : words[checker].toCharArray()) prev[ch - 'a']++;

            var flag = false;
            for (int j = 0; j < 26; j++) {
                if (curr[j] != prev[j]) {
                    flag = true;
                    break;
                }
            }

            if (flag) {
                checker = i;
                ans.add(words[i]);
            }
        }
        return ans;
    }
}
