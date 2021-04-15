package task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6,7,8,9};

        String [] strArr = {"ab", "bc", "cd", "de","ef","fg", "gh", "hi", "ig", "gk"};

        System.out.print("arr = " );
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

        System.out.print("strArr = " );
        for (int i = 0; i < strArr.length; i++) {
            System.out.print(strArr[i] + " ");
        }
        System.out.println("");


        System.out.println(reloadArrayList(strArr));
    }

    public static <T>List reloadArrayList(T [] arr){
        List<T> arrList = new ArrayList<T>();
        Collections.addAll(arrList, arr);
        return arrList;
    }

}

