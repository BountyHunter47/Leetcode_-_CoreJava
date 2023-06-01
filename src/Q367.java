public class Q367 {
    public static void main(String[] args) {
        System.out.println(isPerfectSquareRoot(808201));
    }

    private static boolean isPerfectSquareRoot(int num) {
        long left = 1, right = num;

        while (left < right) {
            long mid = left + (right - left) /2;
            long tmp = mid *mid;
            if (left == mid || right == mid) return false;
            if (tmp == num) return true;
            else if (tmp > num) right = mid ;
            else left = mid;
        }
        return true;
    }
}
