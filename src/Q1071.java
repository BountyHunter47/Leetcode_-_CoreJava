public class Q1071 {
    public static void main(String[] args) {
        String str1 = "ABABAB";
        String str2 = "ABAB";

        System.out.println(gcdOfStrings(str1, str2));
    }
    public static String gcdOfStrings(String str1, String str2) {
        String smallerString = str1.length() > str2.length() ? str2 : str1;
        String biggerString = str1.length() > str2.length() ? str1 : str2;

        return gcd(biggerString, smallerString);
    }

    private static String gcd(String str1, String str2) {
        //If both are equal simply return
        if(str1.equals(str2)){
            return str1;
        }
        //If str1(the bigger string) starts with str2 then we can continue
        if(str1.startsWith(str2)){
            //Example ABABAB and AB we know that ABABAB starts with AB
            //So just call gcdOfStrings(ABAB,AB)
            return gcdOfStrings(str1.substring(str2.length()), str2);
        }

        return "";
    }
}
