package task1;

public class Main {
    public static void main(String[] args) {
        int [] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        System.out.print("arr = " );
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

        arr = swap(arr, 5, 6);

        System.out.print("arr = " );
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int [] swap (int arr[], int a, int b){
        int c = arr[a];
        arr[a] = arr[b];
        arr[b] = c;
        return arr;
    }
}
