package sample.DesignPatterns.Factory_Design;

public class Main {
    public static void main(String[] args) {

        CarFactory carFactory = new CarFactory();

        Car car1 = carFactory.getCar("SEDAN");
        car1.drive();

        Car car2 = carFactory.getCar("SUV");
        car2.drive();

        Car car3 = carFactory.getCar("HAtchback");
        car3.drive();
    }

}
