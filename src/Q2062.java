import java.util.HashSet;

public class Q2062 {
    public static void main(String[] args) {
        System.out.println(countVowelSubstring("unicornarihan"));
    }

    private static int countVowelSubstring(String s) {
        HashSet set = new HashSet<>();
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            set.clear();
            for (int j = i; j < s.length(); j++) {
                if (s.charAt(j) == 'a' || s.charAt(j) == 'e' ||s.charAt(j) == 'i' ||s.charAt(j) == 'o' ||s.charAt(j) == 'u') set.add(s.charAt(j));
                else break;

                if (set.size() == 5) ans++;
            }
        }

        return ans;
    }
}
