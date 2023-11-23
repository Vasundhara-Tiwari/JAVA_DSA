package Assignment1;

import java.util.Scanner;

public class HollowRhombusPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int space = n-1;
        while(i<=n){
            int j = 1;
            int k = 1;
            while(k<=space){
                System.out.print(" ");
                k++;
            }
            while(j<=n){
                if(j == 1 || j == n || i == 1 || i == n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println();
            i++;
            space--;
        }
    }
}
