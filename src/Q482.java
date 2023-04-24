public class Q482 {
    public static void main(String[] args) {
        System.out.println(reformateString("5F3Z-2e-9-w", 4));
    }

    private static String reformateString(String s, int k) {
        String noDashString = "";

        for (char ch : s.toCharArray()) if (ch != '-') noDashString += Character.toUpperCase(ch);
        System.out.println(noDashString);

        int firstGroup = noDashString.length() % k;
        int i = 0;
        String ans = "";
        while (firstGroup != 0) {
            ans += noDashString.charAt(i);
            if (firstGroup == 1) ans +='-';
            firstGroup--;
            i++;
        }
        int checker = 0;
        while (i < noDashString.length()) {
            if (checker == k) {
                checker = 0;
                ans += '-';
                continue;
            }
            ans+=noDashString.charAt(i);
            checker++;
            i++;
        }
        return ans;
    }
}
