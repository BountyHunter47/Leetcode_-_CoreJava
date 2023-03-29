import java.util.Arrays;

public class Q2595 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(evenOddBit(2)));
    }
    public static int[] evenOddBit(int n) {
        int[] ans = new int[2];

        String check = Integer.toBinaryString(n);

        var even = 0;
        var odd = 0;
        var tmp = 0;
        for (int i = check.length()-1; i >= 0 ; i--) {
            if (check.charAt(i) == '1' && tmp % 2 == 0) even++;
            else if (check.charAt(i) == '1' && tmp % 2 != 0) odd++;
            tmp++;
        }
        ans[0] = even;
        ans[1] = odd;
        return ans;
    }
}
