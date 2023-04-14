public class Q2609 {
    public static void main(String[] args) {
        System.out.println(balancedString("00101"));
    }

    private static int balancedString(String s) {
        int checker = 0;
        int zero = 0;
        int one = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                if (one > 0){
                    zero = 0;
                    one = 0;
                }
                zero++;
            }
            else if (zero != 0)one++;

            if (one != 0) {
                checker = Math.max(checker, Math.min(one, zero)*2);
                if (zero == one) {
                    zero = 0;
                    one = 0;
                }
            }
        }

        return checker;
    }
}
