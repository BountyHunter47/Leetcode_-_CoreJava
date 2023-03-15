import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Q1656_DesignanOrderedStream {
    public static void main(String[] args) {

        Q1656_DesignanOrderedStream q = new Q1656_DesignanOrderedStream(5);
        q.insert(3,"ccccc");
        q.insert(1, "aaaaa");
        q.insert(2, "bbbbb");
        q.insert(5, "eeeee");
        q.insert(4, "ddddd");
    }
    int ptr;
    String[] dp = new String[1015];

    public Q1656_DesignanOrderedStream(int n) {
        ptr = 1;
    }

    public List<String> insert(int id, String value) {
        dp[id] = value;
        List<String> ans = new ArrayList<>();
        if(!Objects.equals(dp[ptr], null)){
            for(int i = ptr; i < dp.length; i++){
                if(!Objects.equals(dp[ptr], null)) {
                    ans.add(dp[ptr]);
                    ptr++;
                }
                else break;
            }
        }
        System.out.println(ans);
        return ans;
    }
}
