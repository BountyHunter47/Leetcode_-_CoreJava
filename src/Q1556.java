public class Q1556 {
    public static void main(String[] args) {
        System.out.println(addDot(123456789));
    }

    private static String addDot(int n) {
        StringBuilder holder = new StringBuilder(String.valueOf(n));
        if (holder.length() <= 3) return String.valueOf(holder);

        String ans = "";

        int i = 0;
        while (i < holder.length()) {
            if (i > 0  && (holder.length()- i )% 3 == 0) ans += '.';
            ans += holder.charAt(i);
            i++;
        }

        return ans;
    }
}
