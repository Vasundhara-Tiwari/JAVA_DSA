package Lec2;

import java.util.Scanner;

public class Pattern26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = 1;
        int space = n - 1;
        while(row <= n){
            int num = 1;
            int j = 1;
            while(j <= space){
                System.out.print("    ");
                j++;
            }
            int k = 1;
            while(k<=star) {
                if(num>9){
                    System.out.print(num+"  ");
                }
                else{
                    System.out.print(num+"   ");
                }
                num++;
                k++;
            }
            System.out.println();
            space--;
            star+=2;
            row++;
        }
    }
}
