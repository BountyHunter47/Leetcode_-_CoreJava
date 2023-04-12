public class Q2255 {
    public static void main(String[] args) {
        System.out.println(countPrefixes(new String[]{"a","b","c","ab","bc","abc"}, "abc"));
    }
    public static int countPrefixes(String[] words, String s) {
        int ans = 0;

        for (String str : words) if (s.startsWith(str)) ans++;

        return ans;
    }
}
