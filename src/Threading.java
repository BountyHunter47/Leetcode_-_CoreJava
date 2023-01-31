public class Threading extends Thread{
    static Thread tempThread;
    public static void main(String[] args) throws InterruptedException  {
        Sleep s = new Sleep();
        s.start();
        s.interrupt();
    }
}
class Sleep extends Thread {
    @Override
    public void run(){
        System.out.println(Thread.interrupted());
        System.out.println(Thread.currentThread().isInterrupted());
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class Join extends Thread {
    public void run() {
        //            Threading.t.join();
        for (int i = 1; i < 6; i++) {
            System.out.println(Thread.currentThread().getName()+ " " +i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
class Yield extends Thread {
    @Override
    public void run(){
        Thread.yield();
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() +" "+ i);
        }
        System.out.println("Its an yeilded Thread!");
    }
}
class Video extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("1 Video ");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Music extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("2 Music ");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Progress extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("3 Progress Bar ");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Timer extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("4 Timer ");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
