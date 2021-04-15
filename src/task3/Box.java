package task3;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    ArrayList<T> arr = new ArrayList<>();

    public void addFruitInBox(T fruit) {
        arr.add(fruit);
    }

    public float getWeight(){
        float sum = 0;
        for (T c : arr){
            sum = sum + c.getWeight();
        }
//        System.out.println("Weight коробки " + this + " : " + sum);
        return sum;
    }

    public boolean compare(Box<?> box){
        if((this.getWeight() - box.getWeight()) == 0){
            return true;
        }
        return false;
    }

    public void pourItOver(Box<T> box){
        box.arr.addAll(this.arr);
        this.arr.clear();
        System.out.println("");

        //Выводит на экран коробку в которую пересыпали фрукты и ту из которой пересыпали
        System.out.println("Бокс в который пересыпали : ");
        for(T c: box.arr) {
            System.out.println(c + " ");
        }
        System.out.println("Бокс из которого пересыпали : ");
        for(T c: this.arr) {
            System.out.println(c + " ");
        }
        //-------------------------------------------------------------------------------
    }
}
