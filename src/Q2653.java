import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q2653 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getSUbArrayBeauty(new int[]{1,-1,-3,-2,3}, 3, 2)));
    }

    private static int[] getSUbArrayBeauty(int[] nums, int k, int x) {
        int[] freq = new int[51];
        List<Integer> list = new ArrayList<>();
        var flag = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) freq[Math.abs(nums[i])]++;
            if (flag) {
                if (nums[i - k] < 0) freq[Math.abs(nums[i - k])]--;
                int tmp = x;
                var flag2 = true;
                for (int j = freq.length-1; j >= 0; j--) {
                    if (freq[j] > 0 && flag2) {
                        if (tmp - freq[j] <= 0) {
                            flag2 = false;
                            tmp -= freq[j];
                            list.add(j * -1);
                        }
                        else if (flag2) {
                            tmp -= freq[j];
                            if (tmp == 0) {
                                flag2 = false;
                                tmp--;
                                list.add(j * -1);
                            }
                        }
                    }
                }
                if (tmp > 0) list.add(0);
            }
            else {
                if (i == k-1) {
                    flag = true;
                    int tmp = x;
                    var flag2 = true;
                    for (int j = freq.length-1; j >= 0; j--) {
                        if (freq[j] > 0 && flag2) {
                            if (tmp - freq[j] <= 0) {
                                flag2 = false;
                                tmp -= freq[j];
                                list.add(j * -1);
                            }
                            else if (flag2) {
                                tmp -= freq[j];
                                if (tmp == 0) {
                                    flag2 = false;
                                    tmp--;
                                    list.add(j * -1);
                                }
                            }
                        }
                    }
                    if (tmp > 0) list.add(0);
                }
            }
        }
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}
