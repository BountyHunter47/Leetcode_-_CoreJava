public class Q1758 {
    public static void main(String[] args) {
        System.out.println(minOperations("10"));
    }

    private static int minOperations(String s) {
        StringBuilder sb = new StringBuilder(s);
        int ans1 = 0, ans2 = 0;

        for (int i = 0; i < sb.length(); i++) {
            if (i % 2 == 0 && s.charAt(i) == '1') ans1++;
            else if (i % 2 != 0 && s.charAt(i) == '0') ans1++;

            if (i % 2 == 0 && s.charAt(i) == '0') ans2++;
            else if (i % 2 != 0 && s.charAt(i) == '1') ans2++;

        }
        return Math.min(ans1, ans2);
    }
}
