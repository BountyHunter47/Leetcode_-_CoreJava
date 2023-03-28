import java.util.HashMap;
import java.util.Map;

public class Q748 {
    public static void main(String[] args) {
        System.out.println(shortestCompletingWord("1s3 456", new String[]{"looks","pest","stew","show"}));
    }
    public static String shortestCompletingWord(String licensePlate, String[] words) {
        String ans = "ahsfjkahfjksdhfjsdhfhsdfhsdkfhksdfjksdf";

        for (String str : words) {
            Map<Character,Integer> map = new HashMap<>();
            boolean flag = true;
            for (char ch : licensePlate.toCharArray()){
                ch = Character.toLowerCase(ch);
                if(ch >= 'a' && ch <= 'z'){
                    map.put(ch,map.getOrDefault(ch,0)+1);
                }
            }
            for (char ch : str.toCharArray()) {
                if (map.containsKey(ch)) {
                    map.put(ch, map.get(ch)-1);
                }
            }
            for (int i : map.values()){
                if (i != 0) {
                    flag = false;
                    break;
                }
            }
            if (flag && str.length() < ans.length()) ans = str;
        }
        return ans;
    }
}
