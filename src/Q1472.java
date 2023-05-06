import java.util.Stack;

public class Q1472 {
    public static void main(String[] args) {
        Q1472 obj = new Q1472("zav.com");
        obj.visit("kni.com");
        System.out.println(obj.back(7));
        System.out.println(obj.back(7));
        System.out.println(obj.forward(5));
        System.out.println(obj.forward(1));
        obj.visit("pwrrbnw.com");
        obj.visit("mosohif.com");
        System.out.println(obj.back(9));

    }

    Stack<String> back = new Stack<>();
    Stack<String> forward = new Stack<>();

    public Q1472 (String homepage){
        back.add(homepage);
    }
    public void visit(String url) {
        forward.clear();
        back.add(url);
    }

    public String back(int steps) {
        while (steps != 0 && !back.isEmpty()) {
            if (back.size() == 1) return back.peek();
            String tmp = back.pop();
            if (back.isEmpty()){
                forward.add(tmp);
                return tmp;
            }
            forward.add(tmp);
            steps--;
        }
        return back.peek();
    }

    public String forward(int steps) {
        if (forward.isEmpty()) return back.peek();
        while (steps != 0 && !forward.isEmpty()) {
            String tmp = forward.pop();
            back.add(tmp);
            steps--;
            if (steps == 0 || forward.isEmpty()) return tmp;
        }
        return "";
    }

}
