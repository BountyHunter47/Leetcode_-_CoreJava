public class Q125 {
    public static void main(String[] args) {
        System.out.println(isPlaindrome("A man, a plan, a canal: Panama"));
    }

    private static boolean isPlaindrome(String s) {
            if (s.isEmpty()) {
                return true;
            }
            int start = 0;
            int last = s.length() - 1;
            while(start <= last) {
                char currFirst = s.charAt(start);
                char currLast = s.charAt(last);
                if (!Character.isLetterOrDigit(currFirst )) {
                    start++;
                } else if(!Character.isLetterOrDigit(currLast)) {
                    last--;
                } else {
                    if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
                        return false;
                    }
                    start++;
                    last--;
                }
            }
        return true;
    }
}
