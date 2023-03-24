import java.util.ArrayList;
import java.util.List;

public class Q989 {
    public static void main(String[] args) {
        int[] nums = {9,9,9,9,9,9,9,9,9,9};
        System.out.println(addToArrayForm(nums,34));
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>();

        StringBuilder sb = new StringBuilder();

        for(int i : num) sb.append(i);

        long tmp = Long.parseLong(String.valueOf(sb));
        tmp += k;

        sb = new StringBuilder(String.valueOf(tmp));

        for (int i = 0; i < sb.length(); i++) {
            list.add(Integer.parseInt(String.valueOf(sb.charAt(i))));
        }
        return list;
    }
}
