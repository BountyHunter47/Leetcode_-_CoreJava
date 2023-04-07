public class Q2243 {
    public static void main(String[] args) {
        System.out.println(digitSum("11111222223", 3));
    }
    public static String digitSum(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        StringBuilder tmp = new StringBuilder();
        StringBuilder kHolder = new StringBuilder();

        int count = 0;
        int idx = 0;
        while (sb.length() > k) {
            if (count == k || idx == sb.length()) {
                int tmpIdx = 0;
                int sum = 0;
                while (tmpIdx < kHolder.length()) {
                    sum += Integer.parseInt(String.valueOf(kHolder.charAt(tmpIdx++)));
                }
                tmp.append(sum);
                count = 0;
                kHolder = new StringBuilder();
                if (idx == sb.length()) {
                    idx = 0;
                    sb = tmp;
                    tmp = new StringBuilder();
                    continue;
                }
            }
            kHolder.append(sb.charAt(idx++));
            count++;
        }

        return sb.toString();
    }
}
