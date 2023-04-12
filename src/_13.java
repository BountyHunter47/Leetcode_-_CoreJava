import java.util.ArrayList;
import java.util.List;

public class _13 {
    public static void main(String[] args) {
        System.out.println(checkPalindrome("  naman hs naman "));
    }

    private static boolean checkPalindrome(String s) {
        List<String> list = new ArrayList<>();

        String tmp = "";
        int checker = 0;
        for (int i = 0; i < s.length(); i++) {
            if (checker > 0 && s.charAt(i) == ' ') {
                list.add(tmp);
                tmp = "";
                checker = 0;
            }
            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')){
                checker++;
                tmp += s.charAt(i);
            }
        }
        if (tmp != "") list.add(tmp);
        System.out.println(list);
        for (String str : list) {
            int left = 0, right = str.length()-1;
            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) return false;
                left++;
                right--;
            }
        }

        return true;
    }
}
