public class Q2437 {
    public static void main(String[] args) {
        System.out.println(countTime("??:??"));
    }

    private static int countTime(String s) {

        int ans = 1;

        if (s.charAt(0) == '?' && s.charAt(1) == '?') ans *= 24;
        if (s.charAt(3) == '?' && s.charAt(4) == '?') ans *= 60;
        if (s.charAt(0) != '?' && s.charAt(1) == '?') ans *= 10;
        if (s.charAt(1) != '?' && s.charAt(0) == '?') ans *= 2;
        if (s.charAt(3) != '?' && s.charAt(4) == '?') ans *= 10;
        if (s.charAt(4) != '?' && s.charAt(3) == '?') ans *= 10;

        return ans;
    }
}
