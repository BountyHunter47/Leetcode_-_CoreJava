public class Q1688_CountofMatchesTournament {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(numberOfMatches(n));
    }

    private static int numberOfMatches(int n) {
        int max = Integer.MAX_VALUE, min = 0;
        int ans = 0;
        while(max != 0){
            max = Math.abs(Math.max((n/2),(n/2)-n));
            min = Math.abs(Math.min((n/2),(n/2)-n));
            ans += min;
            n /= 2;
            max /= 2;
        }
        return ans;
    }
}
