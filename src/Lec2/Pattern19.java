package Lec2;

import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = -1;
        int row = 1;
        int star = n/2+1;
        while(row<=n){
            int j = 1;
            while(j<=star){
                System.out.print("*  ");
                j++;
            }
            int k = 1;
            while(k <= space){
                System.out.print("   ");
                k++;
            }
            int i = 1;
            if(row == n || row == 1){
                i = 2;
            }
            while(i <= star){
                System.out.print("*  ");
                i++;
            }
            if(row > n/2){
                space-=2;
                star++;
            } else{
                space+=2;
                star--;
            }
            row++;
            System.out.println();
        }
    }
}
