import java.util.HashSet;
import java.util.Set;

public class Q893 {
    public static void main(String[] args) {
        System.out.println(nusOfSpecialEquivGroups(new String[] {"abcd","cdab","cbad","xyzz","zzxy","zzyx"}));
    }
    public static int nusOfSpecialEquivGroups(String[] words) {
        Set<String> set = new HashSet<>();
        for (String word : words) {
            set.add(sort(word));
        }
        return set.size();
    }

    private static String sort(String word) {
        char[] w = word.toCharArray();
        for (int i = 0; i < w.length; i++) {
            for (int j = i +2; j < w.length; j+=2) {
                if (w[i] > w[j]){
                    char tmp = w[i];
                    w[i] = w[j];
                    w[j] = tmp;
                }
            }
        }
        return new String(w);
    }
}
