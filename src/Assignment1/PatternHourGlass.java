package Assignment1;

import java.util.Scanner;

public class PatternHourGlass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int val = n;
        int space = 0;
        while(row <= n*2+1){
            int k = 0;
            while(k <= space){
                System.out.print(" ");
                k++;
            }
            int i = val;
            while(i >= 0){
                System.out.print(i);
                i--;
            }
            int j = 1;
            while(j<= val){
                System.out.print(j);
                j++;
            }
            if(row >= n+1){
                space--;
                val++;
            }
            else{
                space++;
                val--;
            }
            row++;
            System.out.println();
        }
    }
}
