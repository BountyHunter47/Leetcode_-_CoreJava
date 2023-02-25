import java.util.Arrays;

public class Q2500_delete_greatest {
    public static void main(String[] args) {
        int[][] arr = {{1,2,4},{3,3,1}};
        System.out.println(delete_greatest(arr));
    }

    private static int delete_greatest(int[][] arr) {
        int res = 0;
        for (int i=0;i<arr.length;i++) {
            Arrays.sort(arr[i]);
        }
        for (int i=0;i<arr[0].length;i++){
            int max = 0;
            for (int j=0;j<arr.length;j++)
            {
                max = Math.max(max,arr[j][i]);
            }
            res += max;

//            System.out.println(Arrays.toString(arr[i]));
        }
        return res;
    }
}
