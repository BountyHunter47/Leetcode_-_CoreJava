import java.util.*;
import java.util.stream.Collectors;

public class Q1418 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(Arrays.asList("David","3","Ceviche"));
        List<String> list2 = new ArrayList<>(Arrays.asList("Corina","10","Beef Burrito"));
        List<String> list3 = new ArrayList<>(Arrays.asList("David","3","Fried Chicken"));
        List<String> list4 = new ArrayList<>(Arrays.asList("Carla","5","Water"));
        List<String> list5 = new ArrayList<>(Arrays.asList("Carla","5","Ceviche"));
        List<String> list6 = new ArrayList<>(Arrays.asList("Rous","3","Ceviche"));
        List<List<String>> input = new ArrayList<>();
        input.add(list1);
        input.add(list2);
        input.add(list3);
        input.add(list4);
        input.add(list5);
        input.add(list6);
        System.out.println(displayTable(input));
    }

    private static List<List<String>> displayTable(List<List<String>> orders) {
        List<List<String>> ans = new ArrayList<>();

        List<String> headers = new ArrayList<>();
        headers.add("Table");

        List<String> foods = new ArrayList<>();
        for (List<String> list : orders) {
            if (!foods.contains(list.get(list.size()-1))) foods.add(list.get(list.size()-1));
        }
        foods = foods.stream().sorted().collect(Collectors.toList());
        headers.addAll(foods);

        Map<Integer, Map<String, Integer>> map = new TreeMap<>();
        for (List<String> list : orders) {
            int tmp = Integer.parseInt(list.get(1));
            if (map.containsKey(tmp)) {
                Map<String, Integer> tmpMap = map.get(tmp);
                tmpMap.put(list.get(2), tmpMap.getOrDefault(list.get(2), 0) + 1);
                map.put(tmp, tmpMap);
            }else {
                HashMap<String, Integer> tmpMap = new HashMap<>();
                tmpMap.put(list.get(2), 1);
                map.put(tmp, tmpMap);
            }
        }
        ans.add(headers);
        for (int i : map.keySet()) {
            List<String> tmpList = new ArrayList<>();
            tmpList.add(i+"");
            for (int j = 0; j < foods.size(); j++) {
                Map<String, Integer> tmpMap = map.get(i);
                tmpList.add(tmpMap.getOrDefault(foods.get(j), 0) + "");
            }
            ans.add(tmpList);
        }
        return ans;
    }
}
