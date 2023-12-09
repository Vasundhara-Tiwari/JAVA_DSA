package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 8, 9, 11, 13, 14, 18, 19, 20};
        int searchKey = 14;
        System.out.println(search(arr, searchKey));;
    }
    public static int search(int[] arr, int searchKey){
        int startIndex = 0;
        int endIndex = arr.length - 1;
        while(startIndex <= endIndex){
            int mid = (startIndex + endIndex)/2;
            if(arr[mid] == searchKey){
                return mid;
            }
            else if(searchKey > arr[mid]){
                startIndex = mid + 1;
            }
            else {
                endIndex = mid - 1;
            }
        }
        return -1;
    }
}
