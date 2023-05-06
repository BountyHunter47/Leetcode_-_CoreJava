import java.util.HashMap;
import java.util.Map;

public class Q205 {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("badc", "baba"));
    }

    private static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i)) && map.containsValue(t.charAt(i))) return false;
            if (!map.containsKey(s.charAt(i))) map.put(s.charAt(i), t.charAt(i));
            else {
                if (map.get(s.charAt(i)) != t.charAt(i)) return false;
            }
        }

        return true;
    }
}
