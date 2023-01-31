import java.util.Stack;

public class Q1381_DesignaStackWithIncrementOperation {
    public static void main(String[] args) {
        Q1381_DesignaStackWithIncrementOperation call = new Q1381_DesignaStackWithIncrementOperation();
        CustomStack g = call.new CustomStack(3);

        System.out.println(g.push(1));
        System.out.println(g.push(2));
        System.out.println(g.pop());
        System.out.println(g.push(2));
        System.out.println(g.push(3));
        System.out.println(g.push(4));
        System.out.println(g.increment(5,100));
        System.out.println(g.increment(2,100));
        System.out.println(g.pop());
        System.out.println(g.pop());
        System.out.println(g.pop());
        System.out.println(g.pop());
    }

    class CustomStack {
        Stack<Integer> helper;
        Stack<Integer> ans;
        int size;
        public CustomStack(int maxSize) {
            helper = new Stack<>();
            ans = new Stack<>();
            size = maxSize;
        }

        public String push(int x) {
            if(size != 0){
                ans.add(x);
                size--;
            }
            return null;
        }

        public int pop() {
            if(ans.isEmpty()) return -1;
            else {
                size++;
                return ans.pop();

            }
        }

        public String increment(int k, int val) {
            while(!ans.isEmpty()){
                helper.add(ans.pop());
            }
            while(k != 0 && !helper.isEmpty()) {
                int temp = helper.pop();
                ans.add(temp+val);
                k--;
            }
            while(!helper.isEmpty()){
                ans.add(helper.pop());
            }
            return null;
        }
    }

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
}
