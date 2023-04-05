public class Q541 {
    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg",2));
    }

    public static String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder();
        if (k >= s.length()) return sb.append(s).reverse().toString();

        int left = 0, right = k;
        int check = 0;
        while (sb.length() != s.length()) {
            if (right >= s.length()) break;
            StringBuilder str = new StringBuilder(s.substring(left,right));
            if (check % 2 == 0) {
                sb.append(str.reverse());
            }
            else sb.append(str);
            check++;
            left += k;
            right += k;
        }

        if (check % 2 == 0) {
            StringBuilder tmp = new StringBuilder(s.substring(sb.length(), s.length()));
            sb.append(tmp.reverse());
        }
        else{
            for (int i = sb.length(); i < s.length(); i++) sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
