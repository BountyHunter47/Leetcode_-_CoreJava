public class Q1071 {
    public static void main(String[] args) {
        System.out.println(gcdofString("ABABAB", "ABAB"));
    }

    private static String gcdofString(String s1, String s2) {

        if (!s1.contains(s2)) return "";

        for (int i = 0; i < s2.length()-1; i++) {
            for (int j = s2.length(); j >= 0; j--) {
                if (s1.contains(s2.substring(i, j)) && s1.length() % s2.substring(i, j).length() == 0) return s2.substring(i, j);
            }
        }

        return "";
    }
}
