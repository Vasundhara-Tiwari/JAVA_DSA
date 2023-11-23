package Assignment1;

import java.util.Scanner;

public class PatternMountain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = 1;
        int space = 2*n-3;
        while(row <=n){
            int j = 1;
            while(j<=row){
                System.out.print(j+"  ");
                j++;
            }
            int k = 1;
            while(k<= space){
                System.out.print("   ");
                k++;
            }
            int i = row;
            if(n == row){
                i = n-1;
            }
            while(i>=1){
                System.out.print(i+"  ");
                i--;
            }
            space-=2;
            row++;
            star++;
            System.out.println();
        }
    }
}
