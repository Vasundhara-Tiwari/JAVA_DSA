package Lec2;

import java.util.Scanner;

public class Pattern21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = 1;
        int space = 2*n-3;
        while(row <=n){
            int j = 1;
            while(j<=star){
                System.out.print("*  ");
                j++;
            }
            int k = 1;
            while(k<= space){
                System.out.print("   ");
                k++;
            }
            int i = 1;
            if(n == row){
                i = 2;
            }
            while(i<=star){
                System.out.print("*  ");
                i++;
            }
            space-=2;
            row++;
            star++;
            System.out.println();
        }
    }
}
