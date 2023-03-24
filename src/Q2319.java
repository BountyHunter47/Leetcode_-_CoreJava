public class Q2319 {
    public static void main(String[] args) {
        int[][] grid = {{2,0,0,1},{0,3,1,0},{0,5,2,0},{4,0,0,2}};
        System.out.println(checkXMatrix(grid));
    }
    public static boolean checkXMatrix(int[][] grid) {
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if((i == j && grid[i][j] == 0) || (j == (grid[i].length - 1 )- i && grid[i][j] == 0)) return false;
                else if((i != j && grid[i][j] != 0) && j != (grid[i].length - 1 )- i) return false;
            }
        }
        return true;
    }
}
