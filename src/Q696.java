public class Q696 {
    public static void main(String[] args) {
        System.out.println(countBinaryString("00110011"));
    }

    private static int countBinaryString(String s) {
        char check = s.charAt(0);
        int ans = 0;
        int i  = 0, j = 0;
        int one = 0, zero = 0;
        while(i < s.length() && j < s.length()) {
            while (i < s.length() && s.charAt(i) == check) {
                zero++;
                i++;
            }
            j = i;
            while (j < s.length() && s.charAt(j) == s.charAt(i)) {
                one++;
                j++;
            }
            ans += Math.min(one, zero);
            if (i < s.length()) check = s.charAt(i);
            zero = 0;
            one = 0;
        }
        return ans;
    }
}
