public class Q1309 {
    public static void main(String[] args) {
        System.out.println(freqAlphabets("10#11#12"));
    }
    public static String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = s.length()-1; i >= 0; i--) {
            if(s.charAt(i) != '#'){
                String tmp = String.valueOf(s.charAt(i));
                int tmp2 = Integer.parseInt(tmp);
                sb.append((char)(tmp2+'a'-1));
            }
            else{
                String tmp = String.valueOf(s.charAt(i-2) +""+ s.charAt(i-1));
                int tmp2 = Integer.parseInt(tmp);
                sb.append((char)(tmp2+'a'-1));
                i -= 2;
            }
        }
        return sb.reverse().toString();
    }
}
