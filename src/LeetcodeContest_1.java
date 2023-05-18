import java.util.Arrays;

public class LeetcodeContest_1 {
    public static void main(String[] args) {
        int[] nums = {1,3,2,5,1,9,7,5,9};
        Utils.quickSortInAscending(nums);
        System.out.println(Arrays.toString(nums));
        Utils.quickSortInDescending(nums);
        System.out.println(Arrays.toString(nums));

        System.out.println(countSeniors(new String[] {"5612624052M0130","5378802576M6424","5447619845F0171","2941701174O9078"}));
    }

    public static int countSeniors(String[] details) {
        int ans = 0;
        for (String str : details) {
            char tmp = str.charAt(str.length() - 4);
            char tmp2 = str.charAt(str.length() - 3);
            if (tmp >= '6' && tmp2 > '0' || tmp > '6' && tmp2 >= '0') ans++;
        }
        return ans;
    }
}
