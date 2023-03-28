public class Q908 {
    public static void main(String[] args) {
        System.out.println(smallestRangeI(new int[]{1},0));
    }
    public static int smallestRangeI(int[] nums, int k) {
        int max = Integer.MIN_VALUE, min =  Integer.MAX_VALUE;

        for (int i : nums) if(i > max) max = i;
        for (int i : nums) if(i < min) min = i;

        min += k;
        max -= k;
        return min >= max ? 0 : Math.abs(min - max);
    }
}
