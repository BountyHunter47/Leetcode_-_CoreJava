public class Q925 {
    public static void main(String[] args) {
        System.out.println(isLongPressed("pyplrz", "ppyypllr"));
    }

    private static boolean isLongPressed(String name, String typed) {
        int i = 0, j = 0;
        char prev = name.charAt(0);


        while (i < name.length() && j < typed.length()) {
            if (name.charAt(i) == typed.charAt(j)) {
                prev = name.charAt(i);
                i++;
                j++;
            }
            else if (typed.charAt(j) == prev) {
                j++;
            }
            else {
                return false;
            }
        }
        if (j >= typed.length() && i < name.length()) return false;
        while (j < typed.length() && typed.charAt(j) == prev) j++;

        return j == typed.length();
    }
}
