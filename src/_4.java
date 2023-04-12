public class _4 {
    public static void main(String[] args) {
        countDuplicate("akshilJasnias");
    }

    private static void countDuplicate(String s) {
        int[] freq = new int[128];
        int count = 0;
        for (char ch : s.toCharArray()) freq[ch]++;

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 1){
                System.out.print((char) (i) + "-> " + freq[i] + ", ");
                count++;
            }
        }
        System.out.println(count);
    }
}
