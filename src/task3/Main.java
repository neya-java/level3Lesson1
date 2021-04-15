package task3;

public class Main <T> {
    public static void main(String[] args) {
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();
        Apple apple5 = new Apple();
        Apple apple6 = new Apple();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        Orange orange4 = new Orange();
        Orange orange5 = new Orange();
        Orange orange6 = new Orange();

        Box<Apple> box1 = new Box<>();
        Box<Apple> box2 = new Box<>();
        Box<Apple> box3 = new Box<>();
        Box<Apple> box4 = new Box<>();
        Box<Orange> box6 = new Box<>();
        Box<Orange> box7 = new Box<>();
        Box<Orange> box8 = new Box<>();
        Box<Orange> box9 = new Box<>();

        box1.addFruitInBox(apple1);
        box2.addFruitInBox(apple2);
        box2.addFruitInBox(apple3);
        box3.addFruitInBox(apple4);
        box3.addFruitInBox(apple5);
        box3.addFruitInBox(apple6);

        box6.addFruitInBox(orange1);
        box7.addFruitInBox(orange2);
        box7.addFruitInBox(orange3);
        box7.addFruitInBox(orange4);
        box8.addFruitInBox(orange5);
        box8.addFruitInBox(orange6);

        // для наглядного понимания что? сколько? и где лежит?
        System.out.print("Коробка " + box3 + " : ");
        for (Apple c : box3.arr) {
            System.out.print(c + " ");
        }
        System.out.println("");
        System.out.print("Коробка " + box8 + " : ");
        for (Orange c : box8.arr) {
            System.out.print(c + " ");
        }
        System.out.println("");
        //-------------------------------------------------

        //Выводит на экран вес коробки
        System.out.println("Вес коробки " + box6 + " :" + box6.getWeight());
        //Сравнивает вес двух коробок не важно каких
        System.out.println("Cравним " + box6 + " с коробкой " + box2 + " ,равны? : " + box3.compare(box8));
        //Пересыпает из коробки box3 в box1
        box1.pourItOver(box3);
    }
}