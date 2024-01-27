package Recursion;

public class PartitionInArray {
    public static void main(String[] args) {
        int[] arr = {5, 7, 2, 1, 8, 3, 4};
        System.out.println(sortPartition(arr, 0, arr.length-1));
    }
    public static int sortPartition(int[] arr, int startIndex, int endIndex){
        int item = arr[endIndex];
        int idx = startIndex;   // initial index of item
        for(int i = startIndex; i < endIndex; i++){
            if(arr[i] <= item){
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
                idx++;
            }
        }
        int temp = arr[endIndex];
        arr[endIndex] = arr[idx];
        arr[idx] = temp;
        return idx;
    }
}
