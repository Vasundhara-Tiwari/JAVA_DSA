package Assignment4;

import java.util.Scanner;

public class PrintUpperTriangularMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(j >= i){
                    System.out.print(matrix[i][j] + " ");
                } else{
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }
}
