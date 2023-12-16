package TwoDimensionalArrays;

public class StairCaseSearch {
    public static void main(String[] args) {
        int[][] arr = { {1, 2, 3, 4} , {5, 6, 7, 8} , {9, 10, 11, 12} };
        System.out.println(stairCaseSearch(arr, 10));;
    }
    public static boolean stairCaseSearch(int[][] arr, int target){
        int row = 0;
        int col = arr[0].length - 1;
        while(row < arr.length && col >= 0){
            if(arr[row][col] == target){
                return true;
            }
            else if( arr[row][col] > target){
                col--;
            }
            else{
                row++;
            }
        }
        return false;
    }
}
