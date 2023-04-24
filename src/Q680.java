public class Q680 {
    public static void main(String[] args) {
        System.out.println(validPalindrom("maddamz"));
    }

    private static boolean validPalindrom(String s) {
        int i = 0, j = s.length()-1;

        while (i < j){
            if (s.charAt(i) != s.charAt(j)) return checkerpalindrome(s, i+1, j) || checkerpalindrome(s, i, j-1);
            i++;
            j--;
        }
        return true;
    }

    private static boolean checkerpalindrome(String s, int i, int j) {
        while (i < j) if (s.charAt(i++) != s.charAt(j--)) return false;
        return true;
    }
}
