import java.util.Arrays;

public class Q64_Minimum_Path_Sum {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6}};
        findMinimumPath(mat);
    }

    static int findMinimumPath(int[][] mat){
        for (int i = 1; i < mat[0].length; i++) {
            mat[0][i] = mat[0][i] + mat[0][i-1];
        }
        for (int i = 1; i < mat.length; i++) {
            mat[i][0] = mat[i][0] + mat[i-1][0];
        }

        for (int i = 1; i < mat.length; i++) {
            for (int j = 1; j < mat[i].length; j++) {
                if(mat[i][j] + mat[i][j-1] < mat[i][j] + mat[i-1][j]){
                    mat[i][j] += mat[i][j-1];
                }else {
                    mat[i][j] += mat[i-1][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(mat));
        System.out.println(mat[mat.length-1][mat[0].length-1]);
        return  0;
    }
}
