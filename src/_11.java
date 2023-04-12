public class _11 {
    public static void main(String[] args) {
        removeDigits("h23h4h2!!!3g4jjb123j");
    }

    private static void removeDigits(String s) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) < '0' || s.charAt(i) > '9')) ans += s.charAt(i);
        }
        System.out.println(ans);
    }
}
