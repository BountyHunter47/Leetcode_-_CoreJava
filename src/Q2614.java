public class Q2614 {
    public static void main(String[] args) {
        System.out.println(diagonalPrime(new int[][]{{1,2,3},{5,6,7},{9,10,11}}));
    }

    public static int diagonalPrime(int[][] nums) {
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (isPrime(nums[i][i])) ans = Math.max(ans, nums[i][i]);
            if (isPrime(nums[i][nums.length-i-1])) ans = Math.max(ans, nums[i][nums.length-i-1]);
        }

        return ans == Integer.MIN_VALUE ? 0 : ans;
    }

    private static boolean isPrime(int num) {
        if (num<=1)return false;
        for (int j = 2; j*j < num; j++) {
            if (num % j == 0) return false;
        }
        return true;
    }
}
