public class Q400 {
    public static void main(String[] args) {
        System.out.println(nthDigit(11));
    }

    private static int nthDigit(int n) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <= n; i++) {
            sb.append(i);
        }

        return Integer.parseInt(String.valueOf(sb.charAt(n)));
    }
}
