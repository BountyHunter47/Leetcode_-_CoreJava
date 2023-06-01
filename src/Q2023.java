public class Q2023 {
    public static void main(String[] args) {
        System.out.println(numOfPair(new String[] {"777","7","77","77"}, "7777"));
    }

    private static int numOfPair(String[] nums, String target) {
        int ans =0;
        for (int i = 0; i < nums.length -1; i++) {
            for (int j = i +1; j < nums.length; j++) {
                String tmp = nums[i] + nums[j];
                String reverseTmp = nums[j] + nums[i];
                if (tmp.length() == target.length())
                    if (tmp.equals(target)) ans++;
                if (reverseTmp.length() == target.length())
                    if (reverseTmp.equals(target)) ans++;
            }
        }
        return ans;
    }
}
