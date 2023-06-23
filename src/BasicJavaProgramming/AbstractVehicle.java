package BasicJavaProgramming;

abstract class AbstractVehicle {
    int noOfTyres;
    abstract void start();

    void cleaningAmount(){
        System.out.println("Cleaning Amount is fix for all Vehicle");
    }
}

class Car extends AbstractVehicle{

    @Override
    void start() {
        System.out.println("Start with Key");
    }

}

class Scooter extends AbstractVehicle{

    @Override
    void start() {
        System.out.println("Start with Kick");
    }

    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.noOfTyres=4);
        car.start();
        car.cleaningAmount();

        Scooter scooter = new Scooter();
        scooter.start();
        scooter.cleaningAmount();

    }

}
