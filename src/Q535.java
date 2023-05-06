import java.util.HashMap;

public class Q535 {
    public static void main(String[] args) {
        System.out.println();
    }

    HashMap<String, String> map = new HashMap<>();
    int i = 0;
    String encode (String longUrl) {
        i++;
        map.put(i+"", longUrl);
        return i+"";
    }
    String decode (String shortUrl) {
        return map.get(shortUrl);
    }
}
