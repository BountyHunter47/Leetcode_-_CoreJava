public class Q171 {
    public static void main(String[] args) {
        System.out.println(titleToNumber("AB"));
    }
    public static int titleToNumber(String columnTitle) {
        var sum = 0;
        for (char ch : columnTitle.toCharArray()){
            var diff = ch - ('A' + 1);
            sum = (sum * 26) + diff;
        }
        return sum;
    }
}
