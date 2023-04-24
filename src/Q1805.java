import java.util.HashSet;

public class Q1805 {
    public static void main(String[] args) {
        System.out.println(numDifferentInteger("gi851a851q8510v"));
    }

    private static int numDifferentInteger(String s) {

        int i = 0;
        HashSet<String> set = new HashSet<>();

        while (i < s.length()) {
            while (i < s.length() && ((s.charAt(i) > '9') || (s.charAt(i) < '0'))) {
                i++;
            }
            String tmp = "";
            var flag = true;
            var flag2 = false;
            while (i < s.length() && (s.charAt(i) <= '9') && (s.charAt(i) >= '0')) {
                if (s.charAt(i) == '0' && flag){
                    i++;
                    flag2 = true;
                    continue;
                }
                flag = false;
                tmp += s.charAt(i);
                i++;
            }
            if (flag && flag2) set.add("0");
            else if (tmp != "") set.add(tmp);
        }

        return set.size();
    }
}
