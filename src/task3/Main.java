package task3;

public class Main {
    public static void main(String[] args) {
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();

        System.out.println("Apple весит: " + apple1.getWeight());
        System.out.println("Orange весит: " + orange2.getWeight());

        Box box1 = new Box(apple1);
        new box1(apple2);
        Box box2 = new Box(orange1);
    }


}
