package Assignment1;

import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int row = 1;
        while(row <= n){
            int val = 1;
            int i = 1;
            while (i <= row) {
                System.out.print(val + "\t");
                val = val * (row - i) / i;
                i++;
            }
            row++;
            System.out.println();
        }
    }
}
