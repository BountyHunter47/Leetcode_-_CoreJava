import java.util.Arrays;

public class Q319 {
    public static void main(String[] args) {
        System.out.println(bulbSwicth(9));
    }

    private static int bulbSwicth(int num) {
        if (num == 1) return num;
        if (num == 0) return num;
        boolean[] bulb = new boolean[num+1];
        for (int i = num; i > 0; i--) bulb[i] = true;

        for (int i = num; i > 1; i--) {
            int tmp = i;
            int count = 1;
            if (tmp % 2 == 0) {
                while (tmp % 2 == 0 && tmp > 2) {
                    count++;
                    tmp /= 2;
                }
                if (tmp % 2 != 0) count++;
                if (count % 2 == 0) bulb[i] = true;
                else bulb[i] = false;
            } else if (tmp % 3 == 0) {
                while (tmp % 3 == 0 && tmp > 3) {
                    count++;
                    tmp /= 2;
                }
                if (tmp % 2 != 0) count++;
                if (count % 2 == 0) bulb[i] = true;
                else bulb[i] = false;
            }

        }
        for (int i = num; i > 2; i--) {
            if (i % 2 != 0) bulb[i] = false;
        }
        System.out.println(Arrays.toString(bulb));
        int ans = 0;
        for (boolean toggle : bulb) if (toggle) ans++;
        return ans;
    }
}
