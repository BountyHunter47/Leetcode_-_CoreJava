import java.util.ArrayList;
import java.util.Collections;

public class Q944_DeleteColumnstoMakeSorted {
    public static void main(String[] args) {
        String[] str = {"cba","daf","ghi"};
        int[] nums = new int[999999999];
        System.out.println(minDeletionSize(str));
    }

    private static int minDeletionSize(String[] str) {
        int ans = 0;
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Collections.sort(list, Collections.reverseOrder());
        for (int i = 0; i < str[0].length(); i++) {
            for (int j = 1; j < str.length; j++) {
                if(str[j].charAt(i) < str[j-1].charAt(i)){
                    ans++;
                }
            }
        }
        return ans;
    }
}
