package Assignment1;

import java.util.Scanner;

public class FibonacciPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = 1;
        int num1 = 0;
        int num2 = 1;
        while(row <=n){
            int j = 1;
            while(j<=star){
                System.out.print(num1+"\t");
                int num3 = num1 + num2;
                num1 = num2;
                num2 = num3;
                j++;
            }
            row++;
            star++;
            System.out.println();
        }
    }
}
