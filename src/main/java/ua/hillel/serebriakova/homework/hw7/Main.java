package ua.hillel.serebriakova.homework.hw7;

public class Main {
    public static void main(String[] args) {
        Wheel wheel = new Wheel(17, "Michelin");
        Car car = new Car("Toyota", wheel);

        car.drive();
        car.refuel();
        car.printBrand();

        System.out.println("Before changing wheel: " + car);
        car.changeWheel(new Wheel(18, "Goodyear"));
        System.out.println("After changing wheel: " + car);
    }
}
