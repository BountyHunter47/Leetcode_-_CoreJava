import java.util.HashSet;
import java.util.Set;

public class Q2442 {
    public static void main(String[] args) {
        System.out.println(countDistingInteger(new int[]{1,13,10,12,31}));
    }

    private static int countDistingInteger(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int i : nums) {
            set.add(i);
            if (i > 9) {
                StringBuilder sb = new StringBuilder(i+"");
                sb.reverse();
                set.add(Integer.parseInt(String.valueOf(sb)));
            }
        }
        return set.size();
    }
}
