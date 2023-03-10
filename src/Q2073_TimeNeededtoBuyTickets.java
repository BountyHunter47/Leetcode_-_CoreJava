import java.util.LinkedList;
import java.util.Queue;

public class Q2073_TimeNeededtoBuyTickets {
    public static void main(String[] args) {
        int[] tickets = {5,1,1,1};
        System.out.println(timeRequiredToBuy(tickets,0));
    }

    public static int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q = new LinkedList<>();
        int idx = k;
        int ans = 0;

        for(int i : tickets) q.offer(i);

        while(true){
            if(idx == 0){
                if(q.peek() == 0) return ans;
                else idx = q.size();
            }
            if(q.peek() != 0) ans++;
            int temp = q.poll();
            q.offer(temp-1);
            idx--;
        }
    }
}
