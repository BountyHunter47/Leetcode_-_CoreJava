public class Q1909 {
    public static void main(String[] args) {
        System.out.println(canBeIncreasing(new int[]{105,924,32,968}));
    }
    public static boolean canBeIncreasing(int[] nums) {
        int checker = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (checkNumsSorted(nums, i)) return true;
        }
        return false;
    }

    private static boolean checkNumsSorted(int[] nums, int i) {
        int[] tmp = new int[nums.length-1];
        int idx = 0;
        int idx2 = 0;
        while (idx < tmp.length && idx2 < nums.length) {
            if (idx2 == i){
                idx2++;
                continue;
            }
            tmp[idx] = nums[idx2];
            idx++;
            idx2++;
        }

        for (int j = 0; j < tmp.length-1; j++) {
            if (tmp[j] >= tmp[j+1]) return false;
        }
        return true;
    }
}
