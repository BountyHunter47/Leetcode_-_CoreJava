public class Q1763 {
    public static void main(String[] args) {
        System.out.println( longestNiceSubString("YazaAay"));
    }

    private static String longestNiceSubString(String s) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length(); j > i; j--) {
                int[] small = new int[26];
                int[] capital = new int[26];
                for (int k = i; k < j; k++) {
                    if (Character.isUpperCase(s.charAt(k))) capital[s.charAt(k) - 'A']++;
                    if (Character.isLowerCase(s.charAt(k))) small[s.charAt(k) - 'a']++;
                }
                var flag = true;
                var flag2 = false;
                for (int k = 0; k < small.length; k++) {
                    if (small[k] != capital[k] && (small[k] == 0 || capital[k] == 0)) flag = false;
                    if (small[k] > 0 || capital[k] > 0) flag2 = true;
                }
                if (flag && flag2) {
                    if (s.substring(i, j).length() > ans.length()) ans = s.substring(i, j);
                }
            }
        }

        return ans;
    }
}
