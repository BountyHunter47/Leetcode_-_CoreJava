public class Q953 {
    public static void main(String[] args) {
        System.out.println(isAlienSorted(new String[] {"app","apple"}, "abcdefghijklmnopqrstuvwxyz"));
    }

    private static boolean isAlienSorted(String[] words, String order) {
        for (int i = 1; i < words.length; i++) {
            int prev = 0, curr = 0;
            var flag = true;
            while (words[i-1].charAt(prev) == words[i].charAt(curr)) {
                prev++;
                curr++;
                if (curr >= words[i].length() && prev >= words[i-1].length()){
                    flag = false;
                    break;
                }
                else {
                    if (curr >= words[i].length()) return false;
                    if (prev >= words[i-1].length()){
                        flag = false;
                        break;
                    }
                }
            }
            var prevOccur = false;
            var currOccur = false;
            if (flag) {
                int k = 0;
                while (k < order.length()) {
                    if (order.charAt(k) == words[i-1].charAt(prev)) {
                        prevOccur = true;
                        break;
                    }
                    if (order.charAt(k) == words[i].charAt(curr)) {
                        currOccur = true;
                    }
                    k++;
                }
            }
            if (prevOccur && currOccur) return false;
        }
        return true;
    }
}
