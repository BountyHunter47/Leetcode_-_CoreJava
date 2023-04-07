import java.util.ArrayList;
import java.util.Arrays;

public class Q2138 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(divideString("abcdefghij", 3, 'x')));
    }
    public static String[] divideString(String s, int k, char fill) {
        StringBuilder sb = new StringBuilder();
        ArrayList<String> ans = new ArrayList<>();

        int count = 0;
        StringBuilder tmp = new StringBuilder();
        for (int i = 0; i <= s.length(); i++) {
            if (count == k) {
                ans.add(tmp.toString());
                tmp = new StringBuilder();
                count = 0;
            }
            if (i == s.length()) break;
            count++;
            tmp.append(s.charAt(i));
            if (i == s.length()-1 && count != k) {
                while (count != k) {
                    tmp.append(fill);
                    count++;
                }
                ans.add(tmp.toString());
                break;
            }
        }
        return ans.toArray(new String[0]);
    }
}
