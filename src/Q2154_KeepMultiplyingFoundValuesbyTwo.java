public class Q2154_KeepMultiplyingFoundValuesbyTwo {
    public static void main(String[] args) {
        int[] nums = {8,19,4,2,15,3};
        System.out.println(findFinalValue(nums,2));
    }

    private static int findFinalValue(int[] nums,int target) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                target *= 2;
                i = 0;
            }
        }
        return target;
    }
}
