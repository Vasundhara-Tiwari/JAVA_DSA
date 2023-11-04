package Lec2;

import java.util.Scanner;

public class Pattern30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i<=n){
            int j = 1;
            int k = n;
            while(j<=n){
                System.out.print(k+"  ");
                j++;
                k--;
            }
            System.out.println();
            i++;
        }
    }
}
