package ua.hillel.serebriakova.homework.hw7;

class Car {
    private String brand;
    private Wheel wheel;

    public Car(String brand, Wheel wheel) {
        this.brand = brand;
        this.wheel = wheel;
    }

    public void drive() {
        System.out.println("The car is moving.");
    }

    public void refuel() {
        System.out.println("The car is refueling.");
    }

    public void changeWheel(Wheel newWheel) {
        System.out.println("Changing the wheel...");
        this.wheel = newWheel;
    }


    public void printBrand() {
        System.out.println("Car brand: " + brand);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Car car = (Car) obj;
        return brand.equals(car.brand) && wheel.equals(car.wheel);
    }

    @Override
    public int hashCode() {
        int result = brand.hashCode();
        result = 31 * result + wheel.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", wheel=" + wheel +
                '}';
    }
}
