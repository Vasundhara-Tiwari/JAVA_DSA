package Assignment1;

import java.util.Scanner;

public class PatternRhombus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int row = 1;
        int val = 1;
        int space = num-1;
        int start = 1;
        while(row <= num*2-1){
            int j = 1;
            while (j<=space){
                System.out.print("\t");
                j++;
            }
            int k = 1;
            int val1 = start;
            while(k<=val){
                System.out.print(val1+"\t");
                if(k<=val/2){
                    val1++;
                }else{
                    val1--;
                }
                k++;
            }
            System.out.println();
            if(row < num){
                val+=2;
                start++;
                space--;
            }else{
                val-=2;
                start--;
                space++;
            }
            row++;
        }
    }
}
