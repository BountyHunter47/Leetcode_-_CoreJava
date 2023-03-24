import java.util.*;

public class Q884 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(uncommonFromSentences("this apple is sweet", "this apple is sour")));
    }

    public static String[] uncommonFromSentences(String s1, String s2) {
        List<String> list = new ArrayList<>();

        Map<String,Integer> map1 = new HashMap<>();
        Map<String,Integer> map2 = new HashMap<>();

        String[] str1 = s1.split(" ");
        String[] str2 = s2.split(" ");

        for (String str : str1) map1.put(str, map1.getOrDefault(str,0)+1);
        for (String str : str2) map2.put(str, map2.getOrDefault(str,0)+1);

        for (String str : map1.keySet()) if (!map2.containsKey(str) && map1.get(str) == 1) list.add(str);
        for (String str : map2.keySet()) if (!map1.containsKey(str) && map2.get(str) == 1) list.add(str);

        return list.toArray(new String[0]);
    }
}
