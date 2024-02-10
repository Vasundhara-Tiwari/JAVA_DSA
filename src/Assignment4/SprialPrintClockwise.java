package Assignment4;

import java.util.Scanner;

public class SprialPrintClockwise {
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
        spiral(arr);
    }
    public static void spiral(int[][] arr){
        int minR = 0;
        int minC = 0;
        int maxR = arr.length - 1;
        int maxC = arr[0].length - 1;
        int totalElements = arr.length * arr[0].length;
        int c = 0;
        while(c < totalElements){
            for(int i = minC; i <= maxC && c < totalElements; i++){
                c++;
                System.out.print(arr[minR][i] + ", ");
            }
            minR+=1;
            for(int i = minR; i <= maxR && c < totalElements; i++){
                c++;
                System.out.print(arr[i][maxC] + ", ");
            }
            maxC-=1;
            for(int i = maxC; i >= minC && c < totalElements; i--){
                c++;
                System.out.print(arr[maxR][i] + ", ");
            }
            maxR-=1;
            for(int i = maxR; i >= minR && c < totalElements; i--){
                c++;
                System.out.print(arr[i][minC] + ", ");
            }
            minC+=1;
        }
        System.out.print("END");
    }
}
