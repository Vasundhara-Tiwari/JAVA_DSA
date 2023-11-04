package Lec2;

import java.util.Scanner;

public class Pattern22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = n;
        int space = 0;
        while(row <=n){
            int i = star;
            while(i >= 1){
                System.out.print("*  ");
                i--;
            }
            int j = 1;
            while(j<=space){
                System.out.print("   ");
                j++;
            }
            int k = star;
            if(row == 1) {
                k = star-1;
            }
            while(k>=1){
                System.out.print("*  ");
                k--;
            }
            System.out.println();
            if(row==1){
                space++;
            }
            else{
                space+=2;
            }
            row++;
            star--;
        }
    }
}
