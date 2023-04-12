public class _8 {
    public static void main(String[] args) {
        freqArray("akshil jasani MAHESH");
    }

    private static void freqArray(String s) {
        int[] freq = new int[123];

        for (char ch : s.toCharArray()){
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) freq[ch - 'A']++;
        }

        for (int i = 0; i < freq.length; i++) {
            if (i + 'A' <=  'Z' || i + 'A' >=  'a' && i + 'A' <=  'z'){
                System.out.println((char) (i + 'A' )+ "-> " + freq[i]);
            }
        }
    }
}
