public class freqOfCharacter {
    public static void main(String[] args) {
        int[] freq = new int[128];
        String s = "aaaaaaaaaaaa*****!@#bbb$%^&**()_++***";
        System.out.println(1/2);
        for(char ch : s.toCharArray()) freq[ch]++;
        for (int i = 0; i < 128; i++) if (freq[i] != 0) System.out.println((char)(i) + " -> " + freq[i]);




//        for (char i = 'A'; i <= 'Z'; i++) System.out.print(i);
//        for (char i = 'a'; i <= 'z'; i++) System.out.print(i);
//
//        System.out.println();

    }
}
