public class Q1160_FindWordsThatCanBeFormedbyCharacters {
    public static void main(String[] args) {
        String[] words = {"cat","bt","hat","tree"};
        String chars = "atach";
        System.out.println(countCharacters(words,chars));
    }

    private static int countCharacters(String[] words, String chars) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        int sum = 0;

        for(char ch : chars.toCharArray()) freq1[ch - 'a']++;
        for(String s : words){
            boolean flag = true;
            for(char ch : s.toCharArray()) freq2[ch - 'a']++;
            for(char ch : s.toCharArray()){
                if(freq2[ch - 'a'] <= freq1[ch - 'a']){}
                else flag = false;
            }
            if(flag) sum += s.length();
        }
        return sum;
    }
}
