public class OOPS {
    public static void main(String[] args) {

//        person p1 = new person(10,"Rohan");
//        person p2 = new person(25,"Sondagar");
//
//        dev d1 = new dev(12,"Jevin");
//
//        d1.eat();

    }
}

class dev extends person {
    dev(int step, String name){
        super(step,name);
    }
    void eat(){
        System.out.println("food not available");
    }
}

class person{
    int step;
    String name;
    static int count;

    person(int step, String name){
        this.step = step;
        this.name = name;
    }

    void eat(){
        System.out.println(name + " is eating Now, and will walk " + step + " Steps");
    }

    void eat(int time){
        System.out.println(name + " will eat the dinner in " + time +" minutes");
    }

}
