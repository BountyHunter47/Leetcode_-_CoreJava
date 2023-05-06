public class Q2125 {
    public static void main(String[] args) {
        System.out.println(numberOfBeams(new String[] {"011001","000000","010100","001000"}));
    }

    private static int numberOfBeams(String[] bank) {
        int curr = 0, prev = 0;
        int ans = 0;
        for (char ch : bank[0].toCharArray()) if (ch == '1') prev++;
        for (int i = 1; i < bank.length; i++) {
            for (char ch : bank[i].toCharArray()) if (ch == '1') curr++;
            if (curr == 0) continue;
            ans += prev * curr;
            prev = curr;
            curr = 0;
        }

        return ans;
    }
}
