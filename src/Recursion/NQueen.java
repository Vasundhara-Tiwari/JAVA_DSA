package Recursion;

import java.util.Scanner;

public class NQueen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int queens = scanner.nextInt();
        boolean[][] board = new boolean[queens][queens];
        numberOfWays(queens, board, 0);
    }
    public static void numberOfWays(int queen, boolean[][] board, int row){
        if(queen == 0){
            display(board);
            System.out.println();
            return;
        }
        for(int col = 0; col < board[0].length; col++){
            if(isSafe(board, row, col)){
                board[row][col] = true;
                numberOfWays(queen-1, board, row+1);
                board[row][col] = false;
            }
        }
    }
    public static boolean isSafe(boolean[][] board, int row, int col){
        int r = row, c = col;
        //left diagonal
        while(r >= 0 && c >= 0){
            if(board[r][c] == true){
                return false;
            }
            r--;
            c--;
        }
        r = row;
        c = col;
        //right diagonal
        while(r >= 0 && c < board[0].length){
            if(board[r][c] == true){
                return false;
            }
            r--;
            c++;
        }
        r = row;
        c = col;
        //upward
        while(r >= 0){
            if(board[r][c] == true){
                return false;
            }
            r--;
        }
        return true;
    }

    public static void display(boolean[][] board){
        for (int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                System.out.print(board[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
