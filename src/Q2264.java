public class Q2264 {
    public static void main(String[] args) {
        System.out.println(largestGoodInteger("6777133339"));
    }

    public static String largestGoodInteger(String num) {
        int ans = 0;
        var flag = false;
        for (int i = 2; i < num.length(); i++) {
            if (num.charAt(i) == num.charAt(i-1) && num.charAt(i-1) == num.charAt(i-2)) {
                String tmp = "";
                tmp += num.charAt(i);
                tmp += num.charAt(i-1);
                tmp += num.charAt(i-2);
                int nums = Integer.parseInt(tmp);
                ans = Math.max(nums, ans);
                flag = true;
            }
        }
        if (flag && ans==0) return "000";
        return ans == 0 ? "" : String.valueOf(ans);
    }
}
