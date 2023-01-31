public class Q1143_LongestCommonSubsequence {
    public static void main(String[] args) {
        String text1 = "vozsh";
        String text2 = "psnw";
//        if(text2.length() > text1.length()){
//            System.out.println(longestCommonSubsequence(text1,text2));
//        }else {
//            System.out.println(longestCommonSubsequence(text2,text1));
//        }
        System.out.println(longestCommonSubsequence(text2,text1));
    }

    public static int longestCommonSubsequence(String text1, String text2) {
        int ans = 0;
        int[] freq = new int[26];

        char[] arr1 = text1.toCharArray();
        char[] arr2 = text2.toCharArray();

        int idx1 = 0;
        int idx2 = 0;

        for(char ch : text2.toCharArray()) freq[ch-'a']++;

        while(idx1 < arr1.length && idx2 < arr2.length){
            if(arr1[idx1] == arr2[idx2]){
                freq[arr2[idx2] - 'a']--;
                ans++;
                idx1++;
                idx2++;
            }
            else if (freq[arr1[idx1] - 'a'] > 0) {
                idx2++;
            }else{
                idx1++;
                idx2++;
            }
        }
        return ans;
    }
}
