package Lec2;

import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = 1;
        while(row <= 2*n -1){
            int j = 1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }
            row++;
            star++;
            System.out.println();
        }
    }
}
