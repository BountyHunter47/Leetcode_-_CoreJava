import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q1630 {
    public static void main(String[] args) {
        System.out.println(checkArithmeticSubArray(new int[] {4,6,5,9,3,7}, new int[] {0,0,2}, new int[] {2,3,5}));
    }

    private static List<Boolean> checkArithmeticSubArray(int[] nums, int[] l, int[] r) {
        List<Boolean> list = new ArrayList<>();

        for (int i =0; i < l.length; i++) {
            List<Integer> tmp = new ArrayList<>();
            int start = l[i], end = r[i];
            while (start <= end) tmp.add(nums[start++]);
            Collections.sort(tmp);
            int diff = -1;
            if(tmp.size() == 2) list.add(true);
            else if (tmp.size() < 2) list.add(false);
            else {
                var flag = true;
                for(int j = 1; j < tmp.size(); j++) {
                    int val = tmp.get(j) -tmp.get(j -1);
                    if (diff == -1) diff = val;
                    else if (val != diff) {
                        flag = false;
                        break;
                    }
                }
                if (flag) list.add(true);
                else list.add(false);
            }
        }
        return list;
    }
}
