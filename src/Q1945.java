public class Q1945 {
    public static void main(String[] args) {
        System.out.println(getLucky("leetcode", 2));
    }

    public static int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) sb.append((ch-'a')+1);

        while (k != 0) {
            int tmpNums = 0;
            for (int i = sb.length()-1; i >= 0 ; i--) {
                tmpNums += Integer.parseInt(String.valueOf(sb.charAt(i)));
            }
            sb = new StringBuilder(String.valueOf(tmpNums));
            k--;
        }
        System.out.println(sb);
        return Integer.parseInt(String.valueOf(sb));
    }
}
