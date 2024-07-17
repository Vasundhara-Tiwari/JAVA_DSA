package Assignment6;

import java.util.Scanner;

public class Maze_path {
    static int count = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        printPath(0, 0, rows-1, columns-1, "");
        System.out.println("\n"+count);
    }

    private static void printPath(int cr, int cc, int er, int ec, String ans) {
        if(cr == er && cc == ec){
            count++;
            System.out.print(ans+" ");
            return;
        }
        if(cr > er || cc > ec){
            return;
        }
        printPath(cr+1, cc, er, ec, ans+"V");
        printPath(cr, cc+1, er, ec, ans+"H");
    }
}
