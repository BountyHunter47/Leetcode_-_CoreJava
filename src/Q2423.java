public class Q2423 {
    public static void main(String[] args) {
        System.out.println(equalFrequency("bac"));
    }

    private static boolean equalFrequency(String s) {
        int[] freq = new int[26];

        for (char ch : s.toCharArray()) freq[ch - 'a']++;

        for (char ch : s.toCharArray()) {
            int tmp = --freq[ch - 'a'];
            var flag = true;
            if (tmp == 0) {
                for (int i : freq) if (i > 0) {
                    tmp = i;
                    break;
                }
            }
            for (int i = 0; i < freq.length; i++) {
                if (freq[i] > 0 && freq[i] != tmp) {
                    flag = false;
                    break;
                }
            }
            if (flag) return true;
            freq[ch - 'a']++;
        }

        return false;
    }
}
