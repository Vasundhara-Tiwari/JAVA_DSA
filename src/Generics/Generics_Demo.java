package Generics;

public class Generics_Demo {
    public static void main(String[] args) {
        Integer[] arr = {10, 20, 30, 40, 50};
        display(arr);
        String[] arr1 = {"10", "20", "30", "40", "50"};
        display(arr1);

    }
    public static <T>void display(T[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
