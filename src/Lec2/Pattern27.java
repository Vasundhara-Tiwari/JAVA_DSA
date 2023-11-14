package Lec2;

import java.util.Scanner;

public class Pattern27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int val = 1;
        int space = n - 1;
        while(row <= n){
            int num = 1;
            int j = 1;
            while(j <= space){
                System.out.print("\t");
                j++;
            }
            int k = 1;
            int val1 = 1;
            while(k<= val) {
                System.out.print(val1+"\t");
                if(k<=val/2){
                    val1++;
                }else{
                    val1--;
                }
                k++;
            }
            System.out.println();
            space--;
            val +=2;
            row++;
        }
    }

}
