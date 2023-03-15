import java.util.HashSet;

public class Q2506 {
    public static void main(String[] args) {
        String[] words = {"aba","aabb","abcd","bac","aabc"};
        System.out.println(similarPairs(words));
    }

    public static int similarPairs(String[] words) {
        var finalAnswer = 0;
//        {"aba","aabb","abcd","bac","aabc"}
        HashSet<Character> set;
        HashSet<Character> set2;
        for (int i = 0; i < words.length-1; i++){
            set = new HashSet<>();
            for (char ch : words[i].toCharArray()) {
                set.add(ch);
            }
            for (int j = i+1; j < words.length; j++) {
                set2 = new HashSet<>();
                for (char ch : words[j].toCharArray()) {
                    set2.add(ch);
                }
                if (set.equals(set2)) finalAnswer++;
            }
        }
        return finalAnswer;
    }
}
