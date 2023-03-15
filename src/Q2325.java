import java.lang.reflect.Array;
import java.util.*;

public class Q2325 {
    public static void main(String[] args) {
        String key = "the quick brown fox jumps over the lazy dog";
        String msg = "vkbs bs t suepuv";
        decodeMessage(key, msg);
    }


    public static String decodeMessage(String key, String message) {
        Set<Character> set = new HashSet<>();
        Map<Character,Character> map = new HashMap<>();
        var pntr = 97;
        for (char ch : key.toCharArray()){
            if (set.contains(ch) || ch == ' ') continue;
            set.add(ch);
            map.put(ch, (char) pntr);
            pntr++;
        }

        StringBuilder sb = new StringBuilder();
        for (char ch : message.toCharArray()){
            if (ch == ' ') sb.append(" ");
            else sb.append(map.get(ch));
        }
        System.out.println(map);
        System.out.println(sb);

        return sb.toString();
    }
}
