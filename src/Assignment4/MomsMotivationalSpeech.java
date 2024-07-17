package Assignment4;

import java.util.Scanner;

public class MomsMotivationalSpeech {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println(checkLowerTriangle(matrix, size));

    }

    private static boolean checkLowerTriangle(int[][] matrix, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = i+1; j < size; j++) {
                if(matrix[i][j] != 0){
                    return false;
                }
            }
        }
        return true;
    }
}
