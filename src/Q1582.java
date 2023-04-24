public class Q1582 {
    public static void main(String[] args) {
        Q1582 q1582 = new Q1582();
        int[][] nums = {{1,0,0}, {0,0,1}, {1,0,0}};
        System.out.println(q1582.numSpecial(nums));
    }

    public int numSpecial(int[][] mat) {
        int ans = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (getFreq(i, j, mat)) ans++;
            }
        }
        return ans;
    }
    boolean getFreq(int i, int j, int[][] mat) {
        var flag = true;
        for (int k = 0; k < mat[i].length; k++){
            if (j == k) continue;
            if (mat[i][k] == 1) flag = false;
        }
        for (int l = 0; l < mat.length; l++) {
            if (i == l) continue;
            if(mat[l][j] == 1) flag = false;
        }
        return flag;
    }
}
