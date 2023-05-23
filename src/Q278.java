public class Q278 {
    public static void main(String[] args) {
        System.out.println(firstBadVersion(2126753390));
    }

    private static int firstBadVersion(int n) {
        int left = 1, right = n;

        int ans = n+1;
        while (left <= right) {
            int mid = (left + right) /2;
            if (isBadVersion(mid)) {
                ans = Math.min(ans, mid);
                right = mid-1;
            }
            else {
                left = mid +1;
            }
        }
        return ans;
    }

    static boolean isBadVersion(int n) {
        if (n >= 1702766719) return true;
        return false;
    }
}
