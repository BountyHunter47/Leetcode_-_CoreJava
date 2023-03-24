public class Q1385 {
    public static void main(String[] args) {
        int[] nums1 = {4,5,8};
        int[] nums2 = {10,9,1,8};
        System.out.println(findTheDistanceValue(nums1,nums2,2));
    }
    public static int findTheDistanceValue(int[] nums1, int[] nums2, int d) {

        var finalAnswer = 0;
        for (int j : nums1) {
            var flag = true;
            for (int k : nums2) {
                if (Math.abs(j - k) <= d) {
                    flag = false;
                    break;
                }
            }
            if (flag) finalAnswer++;
        }
        return finalAnswer;
    }
}
