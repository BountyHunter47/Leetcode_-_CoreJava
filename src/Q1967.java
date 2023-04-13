public class Q1967 {
    public static void main(String[] args) {
        System.out.println(numOfSubstring(new String[]{"a","abc","bc","d"}, "abc"));
    }

    private static int numOfSubstring(String[] strings, String pref) {
        int ans = 0;
        for (String str : strings) {
            if (pref.contains(str)) ans++;
        }

        return ans;
    }

}
