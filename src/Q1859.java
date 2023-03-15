import java.util.Arrays;

public class Q1859 {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }

    public static String sortSentence(String s) {

        String[] holder = s.split(" ");
        System.out.println(Arrays.toString(holder));
        System.out.println(holder.length);
        String[] preHolder = new String[holder.length];
        for (String st : holder){
            String numericString = String.valueOf(st.charAt(st.length()-1));
            int integerOfString = Integer.parseInt(numericString);
            preHolder[integerOfString - 1] = st.substring(0,st.length()-1);
        }
        StringBuilder sb = new StringBuilder();
        var idx = 0;
        for (String str : preHolder){
            if (idx == preHolder.length-1){
            sb.append(str);
            }else{
                sb.append(str).append(" ");
            }
            idx++;
        }
        System.out.println(sb);

        System.out.println(Arrays.toString(preHolder));
        return sb.toString();
    }
}
