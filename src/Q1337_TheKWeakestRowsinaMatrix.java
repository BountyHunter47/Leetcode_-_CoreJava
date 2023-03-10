import java.util.*;

public class Q1337_TheKWeakestRowsinaMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}};
        System.out.println(Arrays.toString(kWeakestRows(mat, 3)));

    }

    public static int[] kWeakestRows(int[][] mat, int k) {
        Queue<Integer> q = new LinkedList<>();
        System.out.println(q.poll());
        List<Integer> list = new ArrayList<>();
        list.remove(3);
        int[] nums = new int[k];

        for(int i = 0; i < mat[0].length; i++){
            for(int j = 0; j < mat.length; j++){
                if(mat[j][i] == 0 && !list.contains(j)) list.add(j);
            }
        }

        System.out.println(list.size());
        for(int i = 0; i < k; i++){
            nums[i] = list.get(i);
        }
        return nums;
    }
}
