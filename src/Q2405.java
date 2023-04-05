import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q2405 {
    public static void main(String[] args) {
        System.out.println(partitionString("hdklqkcssgxlvehva"));
    }

    public static int partitionString(String s) {
        Set<Character> set = new HashSet<>();

        int ans = 0;
        for (char ch : s.toCharArray()) {
            if (set.contains(ch)) {
                ans++;
                set.clear();
            }
            set.add(ch);
        }

        return ans+1;
    }
}
