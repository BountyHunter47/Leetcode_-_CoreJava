import java.util.Arrays;
import java.util.HashSet;

public class Q931_MinimumFallingPathSum {
    public static void main(String[] args) {
        int[][] mat = {{100,-42,-46,-41},{31,97,10,-10},{-58,51,82,89},{51,81,69,-51}};
        System.out.println(minFallingPathSum(mat));
    }

    private static int minFallingPathSum(int[][] mat) {
        int[][] dp = new int[mat.length][mat[0].length];
        for(int i = 0; i < mat.length; i++) dp[0][i] = mat[0][i];
        HashSet<String> set = new HashSet<>();
        set.add("aondagar");
        set.add("jevin");
        set.add("mahesh");
        set.add("darshan");
        for(String s : set) System.out.println(s);

//        for(int i = 1; i < mat.length; i++){
//            int sum = 0;
//            for(int j = 0; j < mat[i].length; j++){
//                if(j == 0){
//                    sum = Math.min(dp[i-1][j],dp[i-1][j+1]);
//                    dp[i][j] = mat[i][j]+sum;
//                }
//                else if(j == mat.length-1){
//                    sum = Math.min(dp[i-1][j],dp[i-1][j-1]);
//                    dp[i][j] = mat[i][j]+sum;
//                }else{
//                    sum = Math.min(dp[i-1][j],Math.min(dp[i-1][j-1],dp[i-1][j+1]));
//                    dp[i][j] = mat[i][j]+sum;
//                }
//            }
//        }
//        int ans = Integer.MAX_VALUE;
//        for(int i = 0;i < dp.length; i++) ans = Math.min(dp[dp.length-1][i],ans);
//
        return 0;
    }
}
