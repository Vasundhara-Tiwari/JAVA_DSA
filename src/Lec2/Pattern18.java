package Lec2;

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = 1;
        int row = 1;
        int space = n/2;
        while(row<=n){
            int j = 1;
            while(j<= space){
                System.out.print("   ");
                j++;
            }
            int k = 1;
            while(k <= star){
                System.out.print("*  ");
                k++;
            }
            int i = 1;
            while(i <= space){
                System.out.print("   ");
                i++;
            }
            row++;
            if(row > n/2+1){
                star -=2;
                space++;
            } else{
                star +=2;
                space--;
            }
            System.out.println();
        }
    }
}
