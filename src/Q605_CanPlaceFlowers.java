public class Q605_CanPlaceFlowers {
    public static void main(String[] args) {
        int[] nums = {1,0,1,0,1,0,1};
        int n = 1;
        System.out.println(canPlaceFlowers(nums,n));
    }

    private static boolean canPlaceFlowers(int[] nums, int n) {
        int count = 0, ans = 0;
        for(int i : nums){
            if(i == 0) {
                count++;
            }else{
                count=0;
            }
            if(count >= 3 && count % 2 != 0){
                count = 1;
                ans++;
            }
        }
        return n<=ans;
    }
}
