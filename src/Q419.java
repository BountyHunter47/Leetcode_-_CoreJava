public class Q419 {
    public static void main(String[] args) {
        System.out.println(countBattleship(new String[][] {{"X","X","X"}}));
    }

    private static int countBattleship(String[][] mat) {
        boolean[][] seen = new boolean[mat.length][mat[0].length];
        int ans =0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (seen[i][j]) continue;
                if (mat[i][j] == "X") {
                    int row = findRowShips(seen, mat, i, j);
                    int col = findColShips(seen, mat, i, j);
                    seen[i][j] = true;
                    if (row > 0 && col > 0) ans += 2;
                    else ans++;
                }
            }
        }
        return ans;
    }

    private static int findColShips(boolean[][] seen, String[][] mat, int i, int j) {
        int ans = 0;
        i++;
        for (int k = i; k < mat.length; k++) {
            if (mat[k][j] == "X") ans++;
            else break;
            seen[k][j] = true;
        }
        return ans;
    }

    private static int findRowShips(boolean[][] seen, String[][] mat, int i, int j) {
        int ans = 0;
        j++;
        for (int k = j; k < mat[0].length; k++) {
            if (mat[i][k] == "X") ans++;
            else break;
            seen[i][k] = true;
        }
        return ans;
    }
}
