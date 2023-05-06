import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q830 {
    public static void main(String[] args) {
        for(List<Integer> list : largeGroupPositions("aaa")) {
            for (int i : list ) System.out.print(i + " ");
            System.out.println();
        }
    }

    private static List<List<Integer>> largeGroupPositions(String s) {
        int i = 0;
        int idx = 0;
        int checker = 1;
        List<List<Integer>> list = new ArrayList<>();
        var flag = true;
        while (i < s.length()-1) {
            if (s.charAt(i) == s.charAt(i+1)) {
                if (flag) idx = i;
                flag = false;
                checker++;
            }
            else {
                if (checker >= 3) list.add(new ArrayList<>(Arrays.asList(idx, i)));
                flag = true;
                checker = 1;
            }
            i++;
        }
        if (i >= s.length()-1 && checker >= 3) list.add(new ArrayList<>(Arrays.asList(idx, i)));
        return list;
    }
}
