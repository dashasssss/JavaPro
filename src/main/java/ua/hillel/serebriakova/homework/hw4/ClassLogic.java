package ua.hillel.serebriakova.homework.hw4;

import java.util.Random;

public class ClassLogic {
    public static ClassName fillClassNameMethod(ClassName className) {
        Random random = new Random();
        for (int i = 0; i < className.getLength(); i++) {
            className.setElement(i, random.nextInt(100));
        }
        return className;
    }

    public static ClassName updateClassNameMethod(ClassName className, int index, Integer value) {
        className.setElement(index, value);
        return className;
    }

    public static ClassName deleteClassNameMethod(ClassName className, int index) {
        Integer[] oldArray = className.getArray();
        Integer[] newArray = new Integer[oldArray.length - 1];
        int newIndex = 0;
        for (int i = 0; i < oldArray.length; i++) {
            if (i != index) {
                newArray[newIndex] = oldArray[i];
                newIndex++;
            }
        }
        className.setArray(newArray);
        return className;
    }
}
