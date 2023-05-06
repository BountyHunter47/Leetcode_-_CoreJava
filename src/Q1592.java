public class Q1592 {
    public static void main(String[] args) {
        System.out.println(recordSpaces("  hello"));
    }

    private static String recordSpaces(String s) {
        int count = 0;
        int n = s.length();

        for(char ch : s.toCharArray()) if (ch == ' ') count++;
        s = s.replaceAll("\\s+", " ").trim();
        String[] arr = s.split(" ");

        int tmpSpaces = 0;
        int arrlength = arr.length- 1;
        if (count != 0 && arrlength != 0) {
            tmpSpaces = count / arrlength ;
        }
        String spaces = "";
        while (tmpSpaces != 0) {
            spaces += ' ';
            tmpSpaces--;
        }

        String ans = "";
        int i = 0;
        for (String str : arr) {
            if (i == arr.length-1) {
                ans += str;
                break;
            }
            ans += str;
            ans += spaces   ;
            i++;
        }
        int tmp = n - ans.length();
        while (tmp > 0) {
            ans += ' ';
            tmp--;
        }
        return ans;
    }
}
