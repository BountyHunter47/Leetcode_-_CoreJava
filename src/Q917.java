public class Q917 {
    public static void main(String[] args) {
        System.out.println(reverseOnlyLetters("Test1ng-Leet=code-Q!"));
    }

    public static String reverseOnlyLetters(String s) {
        StringBuilder sb = new StringBuilder();

        int idx = 0;
        int i = s.length()-1;
        while (i >= 0 || idx < s.length()) {
            if (sb.length() == s.length()) break;
            if (idx < s.length()) {
                if (s.charAt(idx) > 'z' || (s.charAt(idx) > 'Z' && s.charAt(idx) < 'a') || s.charAt(idx) < 'A') {
                    sb.append(s.charAt(idx));
                    idx++;
                }
                else {
                    if (s.charAt(i) > 'z' || (s.charAt(i) > 'Z' && s.charAt(i) < 'a') || s.charAt(i) < 'A'){
                        i--;
                        continue;
                    }else {
                        sb.append(s.charAt(i));
                        idx++;
                        i--;
                    }
                }
            }
            else {
                if (s.charAt(i) > 'z' || (s.charAt(i) > 'Z' && s.charAt(i) < 'a') || s.charAt(i) < 'A') {
                    i--;
                    continue;
                }
                sb.append(s.charAt(i));
            }
        }


        return sb.toString();
    }
}
