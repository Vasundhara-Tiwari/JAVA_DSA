package Assignment4;

import java.util.Scanner;

public class ColumnWithMaximumSumInAMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int maxSum = 0;
        int col = 0;
        for (int c = 0; c < size; c++) {
            int sum = 0;
            for (int i = 0; i < size; i++) {
                sum += matrix[i][c];
            }
            if(sum >= maxSum){
                col = c;
                maxSum = sum;
            }
        }
        System.out.println(col+1 + " " + maxSum);
    }
}
