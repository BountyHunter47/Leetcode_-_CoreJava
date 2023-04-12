import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class _10 {
    public static void main(String[] args) {
        System.out.println(reverseWord("hello    world  asdasd "));
    }

    private static String reverseWord(String s) {
        List<String> ans = new ArrayList<>();

        String tmp = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                ans.add(tmp);
                ans.add(" ");
                tmp = "";
            }else {
                tmp += s.charAt(i);
            }
        }
        String answer = "";
        for (int i = ans.toArray().length-1; i >= 0; i--) {
            System.out.print(ans.get(i));
            answer += ans.get(i);
        }
        return answer;
//        System.out.println(ans);
    }
}
