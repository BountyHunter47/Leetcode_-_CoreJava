public class Q2293 {
    public static void main(String[] args) {
        int[] nums = {1,3,5,2,4,8,2,2};
        System.out.println(minMaxGame(nums));
    }

    public static int minMaxGame(int[] nums) {
        var n = nums.length;
        while (n >= 1){
            for (int i = 0; i < n/2; i++) {
                if (i % 2 == 0){
                    nums[i] = Math.min(nums[i * 2], nums[(i * 2) + 1]);
                }else{
                    nums[i] = Math.max(nums[i * 2], nums[(i * 2 ) + 1]);
                }
            }
            n /= 2;
        }

        return nums[0];
    }
}
