import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {

        int[][] item1 = {{1,1},{4,5},{3,8}};
        int[][] item2 =  {{3,1},{1,5}};

        TreeMapDemo t = new TreeMapDemo();
        System.out.println(t.mergeSimilarItems(item1,item2));
    }

    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < items1.length; i++) {
            if (map.containsKey(items1[i][0])){
                map.put(items1[i][0],(map.get(items1[i][0])+items1[i][1]));
            }else{
                map.put(items1[i][0],items1[i][1]);
            }
        }
        for (int i = 0; i < items2.length; i++) {
            if (map.containsKey(items2[i][0])){
                map.put(items2[i][0],(map.get(items2[i][0]))+items2[i][1]);
            }else{
                map.put(items2[i][0],items2[i][1]);
            }
        }
        System.out.println(map);
        for(int i : map.keySet()){
            List<Integer> temp = new ArrayList<>();
            temp.add(i);
            temp.add(map.get(i));
            list.add(temp);
        }
        return list;
    }
}
