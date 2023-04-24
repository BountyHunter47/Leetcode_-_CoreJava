public class Q1576 {
    public static void main(String[] args) {
        System.out.println( modifyString("ubv?w"));
    }

    private static String modifyString(String s) {
        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '?') {
                if (i == 0 && i == s.length()-1) {
                    return "a";
                }
                else if (i == 0) {
                    ans += (char)Math.abs(1-s.charAt(i+1));
                }
                else if (i == s.length()-1) {
                    ans += (char)Math.abs(1-s.charAt(i-1));
                }
                else {
                    int abs = Math.abs(1 - s.charAt(i - 1));
                    int abs2 = Math.abs(2 - s.charAt(i - 1));
                    int abs3 = Math.abs(3 - s.charAt(i - 1));
                    if (abs != s.charAt(i-1) &&  abs != s.charAt(i+1)) ans += (char)abs;
                    else if ( abs2 != s.charAt(i-1) && abs2 != s.charAt(i+1)) ans += (char) abs2;
                    else if ( abs3 != s.charAt(i-1) && abs3 != s.charAt(i+1)) ans += (char) abs3;
                }
                continue;
            }
            ans+=s.charAt(i);
        }
        return ans;
    }
}
