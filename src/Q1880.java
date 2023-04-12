public class Q1880 {
    public static void main(String[] args) {
        System.out.println(isSumEqual("j", "j", "bi"));
    }
    public static boolean isSumEqual(String firstWord, String secondWord, String targetWord) {

        int first = 0, second = 0, third = 0;
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        for (char ch : firstWord.toCharArray()) sb1.append(ch-'a');
        for (char ch : secondWord.toCharArray()) sb2.append(ch-'a');
        for (char ch : targetWord.toCharArray()) sb3.append(ch-'a');

        first = Integer.parseInt(String.valueOf(sb1));
        second = Integer.parseInt(String.valueOf(sb2));
        third = Integer.parseInt(String.valueOf(sb3));

        return first + second == third;
    }
}
