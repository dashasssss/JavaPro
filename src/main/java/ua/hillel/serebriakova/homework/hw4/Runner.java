package ua.hillel.serebriakova.homework.hw4;

public class Runner {
    public static void main(String[] args) {

        ClassName className = ClassNameFactory.createClassNameMethod(5);
        System.out.println("Початковий масив: " + className);

        className = ClassLogic.fillClassNameMethod(className);
        System.out.println("Заповнений масив: " + className);

        ClassLogic.updateClassNameMethod(className, 2, 999);
        System.out.println("Масив після оновлення: " + className);

        className = ClassLogic.deleteClassNameMethod(className, 1);
        System.out.println("Масив після видалення: " + className);
    }
}
