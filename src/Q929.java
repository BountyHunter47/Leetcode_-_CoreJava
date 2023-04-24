import java.util.HashSet;
import java.util.Set;

public class Q929 {
    public static void main(String[] args) {
        System.out.println(uniqueEmail(new String[] {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"}));
    }

    private static int uniqueEmail(String[] strings) {
        Set<String> set = new HashSet<>();

        for (String s : strings) {
            String ans = "";
            boolean occurOfPlus = false;
            boolean occurOfAt = false;
            for (char ch : s.toCharArray()) {
                if (ch == '@') occurOfAt = true;
                if (ch == '.' && !occurOfAt) continue;
                if (ch == '+') occurOfPlus = true;
                if (occurOfPlus && !occurOfAt) continue;
                ans += ch;
            }
            set.add(ans);
        }

        return set.size();
    }
}
