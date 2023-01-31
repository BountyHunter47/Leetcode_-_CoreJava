public class DaemonThread {
    public static void main(String[] args) {
        myThread t = new myThread();
        Thread.currentThread().setPriority(100);
        t.setDaemon(true);
        t.start();
        System.out.println("Main Thread " +Thread.currentThread().getPriority());
        System.out.println("Daemon Tread "+t.getPriority());
//        System.out.println(Thread.currentThread().getName());
    }
}

class myThread extends Thread {
    @Override
    public void run(){
//        System.out.println("its Daemon Thread");
    }
}