import Transport.Car;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("Yellow", 1.6F, " auto", 23, true);
        car1.info();

        Car car2 = new Car("black",3.0F,   "mechanic", 20, false);
        car2.info();

        Car car3 = new Car("black",3.0F,  "auto", 43, true);
        car3.info();

        Car car4 = new Car("red",2.4F, "mechanic", 47, true);
        car4.info();

        Car car5 = new Car("orange",1.6F, "auto", 78, false);
        car5.info();

        car4.seasonTyre(0);
    }

}