package Assignment4;

import java.util.Scanner;

public class ABooleanMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] input = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                input[i][j] = scanner.nextInt();
            }
        }
        boolean[][] realZeroes = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                 if(input[i][j] == 1){
                     realZeroes[i][j] = true;
                 }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(input[i][j] == 1 && realZeroes[i][j]){
                    setOnes(input, i, j);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(input[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void setOnes(int[][] input, int cr, int cc) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                input[cr][j] = 1;
                input[i][cc] = 1;
            }
        }
    }
}
