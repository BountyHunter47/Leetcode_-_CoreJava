public class Q415 {
    public static void main(String[] args) {
        System.out.println(addString("456", "77"));
    }

    private static String addString(String s1, String s2) {
        int carry = 0;
        int i = s1.length()-1, j = s2.length()-1;
        StringBuilder sb = new StringBuilder();

        while (carry > 0 || i >= 0 || j >= 0) {
            int s1Int = 0, s2Int = 0;

            if (i >= 0) s1Int = s1.charAt(i) - '0';
            if (j >= 0) s2Int = s2.charAt(j) - '0';

            if (s1Int + s2Int + carry < 10){
                sb.append(carry + s1Int + s2Int);
                carry = 0;
            }
            else {
                int tmp = s1Int + s2Int + carry;
                sb.append(tmp % 10);
                carry = tmp / 10;
            }
            i--;
            j--;
        }
        return sb.reverse().toString();
    }
}
