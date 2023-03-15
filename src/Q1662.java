public class Q1662 {
    public static void main(String[] args) {
        String[] word1 = {"ab","c"};
        String[] word2 = {"a","bc"};
        System.out.println(arrayStringsAreEqual(word1,word2));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder x = new StringBuilder();
        StringBuilder y = new StringBuilder();

        for(String ch : word1) x.append(ch);
        for(String ch : word2) y.append(ch);
        System.out.println("x -> " + x);
        System.out.println("y -> " + y);
        return x.toString().equals(y.toString());
    }
}
