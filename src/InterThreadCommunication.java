class Test extends Thread {
    int total = 0;
    @Override
    public void run(){
        synchronized (this) {
            for (int i = 0; i < 9; i++) {
                total += 100;
            }
        this.notify();
        }
    }
}
public class InterThreadCommunication {
    public static void main(String[] args) throws InterruptedException {
        Test t = new Test();
        t.start();
//        t.join();
        synchronized (t){
            t.wait();
        }
        System.out.println(t.total);
    }
}