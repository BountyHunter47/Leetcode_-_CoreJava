import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class findElementInMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{3,2,4},{4,2,2}};
        int find = 4;
        System.out.println(getElement(mat,find));
    }

    private static int getElement(int[][] mat, int find) {
        for(int[] i : mat){
            Arrays.sort(i);
        }
        for (int i = 0; i < mat.length; i++) {
            if(mat[i][mat[i].length-1] >= find){
                for (int j = 0; j < mat[i].length; j++) {
                    if(mat[i][j] == find) return 1;
                }
                break;
            }
        }
        return -1;
    }
}
