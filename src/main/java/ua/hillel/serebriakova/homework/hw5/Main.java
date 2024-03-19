package ua.hillel.serebriakova.homework.hw5;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car(1, "Camry", "Toyota", "Red", "ABC123", 2015, 15000));
        cars.add(new Car(2, "Civic", "Honda", "Black", "DEF456", 2018, 18000));
        cars.add(new Car(3, "Corolla", "Toyota", "Blue", "GHI789", 2012, 12000));
        cars.add(new Car(4, "X5", "BMW", "White", "JKL012", 2019, 40000));

        String targetBrand = "Toyota";
        System.out.println("Список автомобілів марки " + targetBrand + ":");
        for (Car car : cars) {
            if (car.getBrand().equals(targetBrand)) {
                System.out.println(car);
            }
        }

        String targetModel = "Camry";
        int years = 5;
        System.out.println("\nСписок автомобілів моделі " + targetModel + ", які експлуатуються більше " + years + " років:");
        for (Car car : cars) {
            if (car.getModel().equals(targetModel) && (2024 - car.getYear()) > years) {
                System.out.println(car);
            }
        }

        int targetYear = 2018;
        double minPrice = 17000;
        System.out.println("\nСписок автомобілів " + targetYear + " року випуску, ціна яких більша за " + minPrice + ":");
        for (Car car : cars) {
            if (car.getYear() == targetYear && car.getPrice() > minPrice) {
                System.out.println(car);
            }
        }
    }


}
