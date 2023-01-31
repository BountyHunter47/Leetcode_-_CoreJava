public class ex implements car, woman{
    public static void main(String[] args) {

        ex testing = new ex();
        testing.start();
        testing.coffee();

    }
    @Override
    public void start() {
        System.out.println("start running");
    }

    @Override
    public void coffee() {
        System.out.println("Woman hahahaha");
    }
}
interface car{
    String name = null;
    int price = 0;
    void start();
}

interface woman {
    void coffee();
}

class cat extends animal{
    cat(String type, int year){
        super(type, year);
    }
    @Override
    void detail() {

    }
}
class dog extends animal{
    dog(String type, int year){
        super(type, year);
    }
    @Override
    void detail(){
        System.out.println("dog is "+type+" animal and live for " + year + " Year");
    }
//    void walk(){
//        System.out.println("dog is walking");
//    }
}

abstract class animal {
//    Wild , Pet
    String type;
//    Expected Life Year
    int year;
    animal(String type, int year){
        this.type = type;
        this.year = year;
    }
    abstract void detail();
    void walk(){
        System.out.println("walking");
    }
}

