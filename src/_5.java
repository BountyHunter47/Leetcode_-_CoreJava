public class _5 {
    public static void main(String[] args) {
        System.out.println(checkStrings("mAHESH", "mAhesH"));
    }

    private static boolean checkStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        for (int i = 0; i < s1.length(); i++) {
            if ((s1.charAt(i) == s2.charAt(i)) || (s1.charAt(i) == s2.charAt(i)+32) || (s1.charAt(i) == s2.charAt(i)-32)){

            }else return false;
        }

        return true;
    }
}
