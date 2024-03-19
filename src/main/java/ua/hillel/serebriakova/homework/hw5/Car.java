package ua.hillel.serebriakova.homework.hw5;

public class Car {
    private int id;
    private String model;
    private String brand;
    private String color;
    private String registrationNumber;
    private int year;
    private double price;

    public Car(int id, String model, String brand, String color, String registrationNumber, int year, double price) {
        this.id = id;
        this.model = model;
        this.brand = brand;
        this.color = color;
        this.registrationNumber = registrationNumber;
        this.year = year;
        this.price = price;
    }

    public String getModel() {
        return model;
    }


    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", registrationNumber='" + registrationNumber + '\'' +
                '}';
    }
}
