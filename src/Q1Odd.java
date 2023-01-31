public class Q1Odd {
    public static void main(String[] args) {
        int[] nums = {9,9,2,3};
        System.out.println(odd(nums));
    }
    public static boolean odd(int[] nums){
        int count = 0;
        for(int i : nums){
            if(i % 2 != 0)count++;
            else count = 0;
            if(count == 3)return true;
        }
        int i = Integer.MIN_VALUE;
        return false;
    }
}
