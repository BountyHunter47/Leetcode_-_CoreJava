import java.util.ArrayList;
import java.util.List;

public class Q989 {
    public static void main(String[] args) {
        System.out.println(addToArrayForm(new int[]{2,1,5},806));
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
            int carry = 0, i = num.length-1;
            StringBuilder sb = new StringBuilder();

            while (i >= 0 || k > 0 || carry > 0) {
                int tmp1 = 0;
                if (i >= 0) tmp1 = num[i];
                int tmp2 = k % 10;
                k /= 10;

                if (tmp1 + tmp2 + carry < 10) {
                    sb.append(tmp1 + tmp2 + carry);
                    carry = 0;
                }
                else {
                    int tmp3 = tmp1 + tmp2 + carry;
                    sb.append(tmp3 % 10);
                    carry = tmp3 / 10;
                }
                i--;
            }
            List<Integer> list = new ArrayList<>();
            for (int j = sb.length()-1; j >= 0 ; j--) list.add(sb.charAt(j) - '0');

            return list;
    }
}
