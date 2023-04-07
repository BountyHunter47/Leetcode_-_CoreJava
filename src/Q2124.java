public class Q2124 {
    public static void main(String[] args) {
        System.out.println(checkString("a"));
    }
    public static boolean checkString(String s) {
        int idx = 0;

        while (idx < s.length() && s.charAt(idx) != 'b') {
            idx++;
        }
        while (idx < s.length()) {
            if (s.charAt(idx) == 'a') return false;
            idx++;
        }
        return idx == s.length();
    }
}
