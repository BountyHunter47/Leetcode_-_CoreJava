public class Q860 {
    public static void main(String[] args) {
        System.out.println(lemonadeChange(new int[] {5,5,5,10,20}));
    }

    private static boolean lemonadeChange(int[] bills) {
        int[] nums = new int[21];

        for (int i : bills) {
            if (i == 5) nums[5]++;
            if (i == 10) {
                if (nums[5] > 0) {
                    nums[5]--;
                    nums[10]++;
                }
                else return false;
            }
            if (i == 20) {
                if (nums[10] > 0 && nums[5] > 0) {
                    nums[5]--;
                    nums[10]--;
                    nums[20]++;
                } else if (nums[5] > 0) {
                    nums[5] -= 3;
                    nums[20]++;
                }
                else return false;
            }
        }
        return true;
    }
}
