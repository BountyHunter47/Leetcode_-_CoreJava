public class Q1614 {
    public static void main(String[] args) {
        System.out.println(maxDepth("(1+(2*3)+((8)/4))+1"));
    }
    public static int maxDepth(String s) {
        int checker = 0;
        int tmp = 0;
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') tmp++;
            if (s.charAt(i) == ')') tmp--;

            if (tmp > checker && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                checker = tmp;
            }
            ans = Math.max(tmp, ans);
        }
        return ans;
    }
}
