package Assignment4;

import java.util.Scanner;

public class WavePrintRowWise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int[][] arr = new int[row][col];
        for(int i  = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        wavePrint(arr);
    }
    public static void wavePrint(int[][] arr){
        for(int row = 0; row < arr.length; row++){
            if(row % 2 == 0){
                for(int col = 0; col < arr[0].length; col++){
                    System.out.print(arr[row][col]+", ");
                }
            }
            else{
                for(int col = arr[0].length-1; col >= 0; col--){
                    System.out.print(arr[row][col]+", ");
                }
            }
        }
        System.out.print("END");
    }
}
