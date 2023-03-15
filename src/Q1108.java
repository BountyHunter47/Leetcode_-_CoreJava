public class Q1108 {
    public static void main(String[] args) {
        defangIPaddr("1.1.1.1.");
    }

    public static String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder(address);
        System.out.println(sb);
        for (int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i) == '.'){
                sb.replace(i,i+1,"[.]");
                i++;
            }
        }
        System.out.println(sb);
        return sb.toString();
    }
}
