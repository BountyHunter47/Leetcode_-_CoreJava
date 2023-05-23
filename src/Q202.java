public class Q202 {
    public static void main(String[] args) {
        System.out.println(isNumberHappy(2));
    }

    private static boolean isNumberHappy(int n) {
        while(true) {
            if (n < 1) return false;
            int tmpSum = 0;
            while (n > 0) {
                int tmp = n % 10;
                tmpSum += tmp*tmp;
                n /= 10;
            }
            if (tmpSum == 1) return true;
            n = tmpSum;
        }
    }
}
