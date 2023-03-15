public class Q152 {
    public static void main(String[] args) {
        int[] nums = {2,3,-2,4};
        System.out.println( maxProduct(nums));
    }

    public static int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i : nums) max = Math.max(max, i);

        int currMax = 1, currMin = 1;
        for(int i : nums){
            if(i == 0) {
                currMax = 1;
                currMin = 1;
                continue;
            }
            int tmp = currMax * i;
            currMax = Math.max(currMax * i, Math.max(currMin * i, i));
            currMin = Math.min(tmp, Math.min(currMin * i, i));

            max = Math.max(currMax, max);
        }
        return max;
    }
}
