public class Q1374 {
    public static void main(String[] args) {
        System.out.println(generateTheString(7));
    }

    public static String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();

        int len = n;
        if (n % 2 == 0) {
            len -= 1;
            sb.append("b");
        }
        for (int i = 0; i < len; i++) {
            sb.append("a");
        }

        return  sb.toString();
    }
}
