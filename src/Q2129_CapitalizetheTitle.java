import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Q2129_CapitalizetheTitle {
    public static void main(String[] args) {
        String title = "capiTalIze tHe titLe to an";
        System.out.println(capitalizeTitle(title));
    }

    private static String capitalizeTitle(String title) {
        String[] sarr = title.split(" ");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2;

        for (int i = 0; i < sarr.length; i++) {
            sb2 = new StringBuilder();
            for (char ch : sarr[i].toCharArray()){
                sb2.append(Character.toLowerCase(ch));

            }
            if(sb2.length() > 2){
                sb2.setCharAt(0,(char)(sb2.charAt(0) -32));
            }
                if(i != sarr.length-1){
                    sb.append(sb2).append(" ");
                }else{
                    sb.append(sb2);
                }

        }
        return sb.toString();
    }
}
