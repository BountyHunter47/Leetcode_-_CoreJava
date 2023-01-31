public class Q1816_TruncateSentence {
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 4;
        System.out.println(truncateSentence(s,k));
    }

    private static String truncateSentence(String s, int k) {
        String[] s1 = s.split(" ");
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < s1.length; i++){
            if(i == k) break;
            ans.append(" ").append(s1[i]);
        }
        String ans1 = String.valueOf(ans);
        return ans1;
    }
}
