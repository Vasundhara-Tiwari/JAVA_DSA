package Lec2;

import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = 1;
        int space = n-1;
        while(row<=2*n-1){
            int j = 1;
            while (j <= space){
                System.out.print("   ");
                j++;
            }
            int k = 1;
            while(k <= star){
                System.out.print("*  ");
                k++;
            }
            System.out.println();
            row++;
            if(row > n){
                space++;
                star--;
            }
            else{
                space--;
                star++;
            }
        }
    }
}
