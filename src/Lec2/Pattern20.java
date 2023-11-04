package Lec2;

import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int spaceInitial = n/2;
        int spaceMiddle = -1;
        int row = 1;
        while (row <= n){
            int j = 1;
            while(j<=spaceInitial){
                System.out.print("  ");
                j++;
            }
            System.out.print("* ");
            int i = 1;
            while (i<=spaceMiddle){
                System.out.print("  ");
                i++;
            }
            if(row == 1 || row == n){
                System.out.print("");
            }
            else{
                System.out.print("* ");
            }
            if(row > n/2){
                spaceInitial++;
                spaceMiddle-=2;
            } else{
                spaceInitial--;
                spaceMiddle+=2;
            }
            row++;
            System.out.println();
        }
    }
}
