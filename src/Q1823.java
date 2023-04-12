public class Q1823 {
    public static void main(String[] args) {
        System.out.println(findTheWinner(5, 2));
    }
    public static int findTheWinner(int n, int k) {

        int ans = 0;
        for (int i = 2; i <= n; i++) {
            ans = (ans + k) % i;
        }
        return ans+1;
    }
}
