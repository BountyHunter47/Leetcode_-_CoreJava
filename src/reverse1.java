public class reverse1 {
    public static void main(String[] args) {
        String str ="how are you";
        for (int i = str.length()-1; i>=0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
