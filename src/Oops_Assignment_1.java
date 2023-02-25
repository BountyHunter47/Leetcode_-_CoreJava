import java.util.Scanner;

public class Oops_Assignment_1  {
    public static void main(String[] args) {
        Bike b1 = new Bike();
        b1.changeGear(1);
        Bike b2 = new Bike();
        b2.changeGear(3);
        Bike b3 = new Bike();
        b3.changeGear(4);
//        System.out.println(Bike.currGear);

    }
}

class Bike implements Vehicle {
     int currGear = 0;
    @Override
    public void changeGear(int gear) {
        if (gear <= maxGearBike && gear >= 0){
            System.out.println("Gear Changed From "+ currGear + " to " + gear);
            currGear = gear;
        }else{
            System.out.println("invalid Gear!!");
        }
    }
}
class Car implements Vehicle {
    int currGear = 0;
    @Override
    public void changeGear(int gear) {
        if (gear <= maxGearCar && gear >= 0){
            System.out.println("Gear Changed From "+ currGear + " to " + gear);
            currGear = gear;
        }else{
            System.out.println("invalid Gear!!");
        }
    }
}
class Bicycle implements Vehicle {
    int currGear = 0;
    @Override
    public void changeGear(int gear) {
        if (gear <= maxGearBicyle && gear >= 0){
            System.out.println("Gear Changed From "+ currGear + " to " + gear);
            currGear = gear;
        }else{
            System.out.println("invalid Gear!!");
        }
    }
}
