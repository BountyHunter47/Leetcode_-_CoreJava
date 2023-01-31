public class SynchronizedThreads extends Thread{
    static BookTicket b;
    int seat;
    String name;

    @Override
    public void run(){
        b.book(seat, name);
    }

    public static void main(String[] args) {
        b = new BookTicket();
        SynchronizedThreads s1 = new SynchronizedThreads();
        s1.seat = 6;
        s1.name = "Jevin";
        s1.start();
        SynchronizedThreads s2 = new SynchronizedThreads();
        s2.seat = 10;
        s2.name = "Mahesh";
        s2.start();

    }
}

class BookTicket {
    static int totalSeat = 10;
    static synchronized void book(int seat, String name){
        if (totalSeat - seat < 0) {
            System.out.println("left seat only " + totalSeat);
        } else {
            totalSeat -= seat;
            System.out.println(name + "Seat Booked !!, Left Seats Are :" + totalSeat);
        }
    }
}