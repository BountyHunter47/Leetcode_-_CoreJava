public class Q2490 {
    public static void main(String[] args) {
        System.out.println(isCircularSentence("leetcode exercises sound delightful"));
    }
    public static boolean isCircularSentence(String sentence) {
        String[] name = sentence.split(" ");
        if (name.length == 1) {
            if (name[0].charAt(0) == name[0].charAt(name[0].length()-1)) return true;
            else return false;
        }
        for (int i = 1; i < name.length; i++) {
            if (name[i].charAt(0) != name[i-1].charAt(name[i-1].length()-1)) return false;
            if (name[0].charAt(0) != name[name.length-1].charAt(name[name.length-1].length()-1)) return false;
        }
        return true;
    }
}
