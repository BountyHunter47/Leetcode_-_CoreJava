import java.util.ArrayList;
import java.util.List;

public class floodFillMethod {
    public static void main(String[] args) {
        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
        int sr = 1, sc = 1, color = 2;
        floodFillMethod f = new floodFillMethod();
        f.fillColor(image,sr,sc,color);

    }
    public void fillColor(int[][] image, int sr, int sc, int color){
        if(sr < 0 || sc < 0 || sr >= image.length || sc >= image.length || image[sr][sc] == color) return;
        if(image[sr][sc] != 0 && image[sr][sc] != color) image[sr][sc] = color;

        fillColor(image,sr-1,sc,color);
        fillColor(image,sr,sc-1,color);
        fillColor(image,sr+1,sc,color);
        fillColor(image,sr,sc+1,color);
    }
}
