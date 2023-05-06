import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q1329 {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(diagnolSort(new int[][]{{3,9},{2,4},{1,2},{9,8},{7,3}})));
    }

    private static int[][] diagnolSort(int[][] mat) {

        for (int k = 0; k < mat.length-1; k++) {
            List<Integer> list = new ArrayList<>();
            int i = k, j = 0;
            while (k < mat.length-1 && j < mat.length && j < mat[0].length && i < mat.length) {
                list.add(mat[i][j]);
                i++;
                j++;
            }
            Collections.sort(list);
            i = k; j = 0;
            while (k < mat.length-1 && j < mat.length && j < mat[0].length && i < mat.length) {
                mat[i][j] = list.get(j);
                i++;
                j++;
            }
        }

        for (int k = 1; k < mat[0].length-1; k++) {
            List<Integer> list = new ArrayList<>();
            int i = 0, j = k;
            while (k < mat[0].length-1 && j < mat[0].length&& i < mat.length) {
                list.add(mat[i][j]);
                i++;
                j++;
            }
            Collections.sort(list);
            i = 0; j = k;
            while (k < mat[0].length-1 && j < mat[0].length&& i < mat.length) {
                mat[i][j] = list.get(i);
                i++;
                j++;
            }
        }
        return mat;
    }
}
