public class Q877 {
    public static void main(String[] args) {
//        for (int i : )
        System.out.println(stoneGame(new int[] {5,3,4,5}, 0, 3));
    }

    static int aliceMax = 0;
    private static int stoneGame(int[] piles, int l, int r) {
        if (l > r) return 0;

        boolean choice = (r - l) % 2 != 0;

        int left = choice ? piles[l] : 0;
        int right = choice ? piles[r] : 0;

        aliceMax = Math.max(stoneGame(piles, l +1, r) +left,
        stoneGame(piles, l, r -1) +right);

        return aliceMax;
    }
}
