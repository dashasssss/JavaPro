package ua.hillel.serebriakova.homework.hw4;
import java.util.Arrays;

public class ClassName {
    private Integer[] array;

    public ClassName(int size) {
        this.array = new Integer[size];
    }

    public int getLength() {
        return array.length;
    }

    public int getElement(int index) {
        return array[index];
    }

    public void setElement(int index, int value) {
        array[index] = value;
    }

    public String toString() {
        return Arrays.toString(array);
    }

    public Integer[] getArray() {
        return array;
    }

    public void setArray(Integer[] array) {
        this.array = array;
    }
}
