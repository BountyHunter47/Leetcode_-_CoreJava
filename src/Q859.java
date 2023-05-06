import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q859 {
    public static void main(String[] args) {
        System.out.println(buddyString("ab", "ba"));
    }

    private static boolean buddyString(String s, String goal) {
        if (s.length() != goal.length()) return false;

        if (s.equals(goal)) {
            Set<Character> set = new HashSet<>();
            for (char ch : s.toCharArray()) {
                if (set.contains(ch)) return true;
                else set.add(ch);
            }
            return false;
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) list.add(i);
        }

        return list.size() == 2 && s.charAt(list.get(0)) == goal.charAt(list.get(1)) && s.charAt(list.get(1)) == goal.charAt(list.get(0));
    }
}
