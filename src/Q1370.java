public class Q1370 {
    public static void main(String[] args) {
        String s = "aaaabbbbcccc";
        System.out.println(sortString(s));
    }

    public static String sortString(String s) {
        int[] freq = new int[26];
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) freq[ch - 'a']++;

        int idx = 0;
        boolean flag = true;
        while (sb.length() != s.length()){
            if (idx == freq.length){
                flag = false;
                idx--;
            }
            if (idx == -1) {
                flag = true;
                idx++;
            }
            if (freq[idx] != 0) {
                sb.append((char)(idx+'a'));
                freq[idx]--;
            }
            if (flag) idx++;
            else idx--;
        }
        return sb.toString();
    }
}
