package Lec2;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = n;
        while(row <= n){
            int j = 1;
            while(j <= star) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            star--;
            row++;
        }
    }
}
