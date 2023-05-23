import java.util.Arrays;

public class Q2087 {
    public static void main(String[] args) {
        System.out.println(minCost(new int[]{5,5}, new int[] {5,2}, new int[] {7,1,3,3,5,3,22,10,23}, new int[] {5,5,6,2,0,16}));
    }

    private static int minCost(int[] start, int[] home, int[] rowCost, int[] colCost) {
        int i = start[0], j = start[1];
        int rowTot =0;
        int colTot =0;
        while (i != home[0]) {
            if (i < home[0]) i++;
            else i--;
            if (i >= 0 && i < rowCost.length) rowTot += rowCost[i];
        }
        while (j != home[1]) {
            if (j < home[1]) j++;
            else j--;
            if (j >= 0 && j < colCost.length) colTot += colCost[j];
        }
        return rowTot +colTot;
    }
}
