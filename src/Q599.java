import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Q599 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findRestaurant(new String[]{"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"}, new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"})));
    }

    private static String[] findRestaurant(String[] a, String[] b) {
        ArrayList<String> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        int checker = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) map.put(a[i], i);

        for (int i = 0; i < b.length; i++) {
            var tmp = map.containsKey(b[i]);
            if (tmp && map.get(b[i]) + i < checker) {
                list = new ArrayList<>();
                list.add(b[i]);
                checker = map.get(b[i]) + i;
            }
            else if (tmp && map.get(b[i]) + i == checker) list.add(b[i]);
        }

        return list.toArray(new String[0]);
    }
}
