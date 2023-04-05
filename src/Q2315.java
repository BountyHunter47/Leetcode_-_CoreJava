public class Q2315 {
    public static void main(String[] args) {
        System.out.println(countAsterisks("l|*e*et|c**o|*de|"));
    }
    public static int countAsterisks(String s) {

            int ans = 0;
            boolean flag = true;
            var flagChecker = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '|'){
                    if (flagChecker % 2 == 0) flag = false;
                    else flag = true;
                    flagChecker++;
                }
                if (flag && s.charAt(i) == '*') ans++;
            }

            return ans;
    }
}
