import java.util.*;

public class Q819 {
    public static void main(String[] args) {
        System.out.println(mostCommonWord("a, a, a, a, b,b,b,c, c",new String[]{"a"}));

    }
    public static String mostCommonWord(String paragraph, String[] banned) {
        StringBuilder sb = new StringBuilder();

        for(char ch : paragraph.toCharArray()){
            if (ch == '.' || ch == '!' || ch == '?' || ch == ',' || ch == ';' || ch == 39) sb.append(" ");
            else sb.append(Character.toLowerCase(ch));
        }
        String para = sb.toString();
        String tmp = para.replaceAll("\\s+", "/");
        System.out.println(sb);
//        System.out.println(tmp);

        String[] str = tmp.split("/");
        System.out.println(Arrays.toString(str));

        Map<String,Integer> map = new HashMap<>();
        Set<String> set = new HashSet<>();

        for (String string : banned) {
            set.add( string.toLowerCase().trim());
        }

        for (String string : str) {
            String holder = string.toLowerCase().trim();
            if (set.contains(holder)) continue;
            map.put(holder, map.getOrDefault(holder,0)+1);
        }
        System.out.println(map);

        int max = Integer.MIN_VALUE;
        String ans = "";
        for (String string : map.keySet()){
            if(map.get(string) > max) {
                max = map.get(string);
                ans = string;
            }
        }
//        System.out.println(sb);
//        String[] str = paragraph.split(" ");
        return ans;
    }
}
