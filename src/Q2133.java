import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Q2133 {
    public static void main(String[] args) {
        System.out.println(checkValidMatrix(new int[][] {{1,2,3},{2,1,2},{3,3,1}}));
    }

    private static boolean checkValidMatrix(int[][] mat) {

        for (int i = 0; i < mat.length; i++) {
            Set<Integer> set = new HashSet<>();
            for (int j = 0; j < mat[0].length; j++) {
                set.add(mat[i][j]);
            }
            if (set.size() != mat.length) return false;
        }
        for (int i = 0; i < mat[0].length; i++) {
            Set<Integer> set = new HashSet<>();
            for (int j = 0; j < mat.length; j++) {
                set.add(mat[j][i]);
            }
            if (set.size() != mat.length) return false;
        }
        return true;
    }
}
