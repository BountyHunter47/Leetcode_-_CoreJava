public class Q1052 {
    public static void main(String[] args) {
        System.out.println(maxSatisfaction(new int[] {1,0,1,2,1,1,7,5}, new int[] {0,1,0,1,0,1,0,1}, 3));
    }

    private static int maxSatisfaction(int[] cust, int[] grumpy, int m) {
        int ans = 0;
        int max = 0;
        int sum = 0;
        for (int i = 0; i < cust.length; i++) {
            if (grumpy[i] == 0) ans += cust[i];
            if (i -m < 0) {
                if (grumpy[i] == 1) {
                    sum += cust[i];
                }
            }
            else {
                if (grumpy[i] == 1) sum += cust[i];
                if (grumpy[i -m] == 1) sum -= cust[i -m];
            }
            max = Math.max(max, sum);
        }
        return ans +max;
    }
}
