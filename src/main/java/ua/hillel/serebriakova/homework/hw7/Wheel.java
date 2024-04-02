package ua.hillel.serebriakova.homework.hw7;

class Wheel {
    private int size;
    private String brand;


    public Wheel(int size, String brand) {
        this.size = size;
        this.brand = brand;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Wheel wheel = (Wheel) obj;
        return size == wheel.size && brand.equals(wheel.brand);
    }

    @Override
    public int hashCode() {
        int result = size;
        result = 31 * result + brand.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "size=" + size +
                ", brand='" + brand + '\'' +
                '}';
    }
}
