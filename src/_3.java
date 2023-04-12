public class _3 {
    public static void main(String[] args) {
        System.out.println(countWordInNumber(" sd asdm   m  llsd sd  sds "));
    }

    private static int countWordInNumber(String s) {
        int tmp = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (tmp > 0 && s.charAt(i) == ' ') {
                count++;
                tmp = 0;
            }
            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) tmp++;
        }
        return s.charAt(s.length()-1) == ' ' ? count : count+1;
    }
}
