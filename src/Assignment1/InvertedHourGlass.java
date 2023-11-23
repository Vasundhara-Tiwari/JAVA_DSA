package Assignment1;

import java.util.Scanner;

public class InvertedHourGlass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int row = 1;
        int times = 1;
        int space = num*2-1;
        while(row <= num*2+1){
            int i = 1;
            int val = num;
            while(i <= times){
                System.out.print(val+" ");
                if(times <= num+1){
                    val--;
                }else{
                    val++;
                }
                i++;
            }
            int sp = 1;
            while(sp <= space){
                System.out.print("  ");
                sp++;
            }
            i=1;
            int val2 = val+1;
            if(row == num+1){
                i=2;
                val2 = val+2;
            }
            while(i <= times){
                System.out.print(val2+" ");
                if(times <= num+1){
                    val2++;
                }else{
                    val2--;
                }
                i++;
            }
            if(row <= num){
                space-=2;
                times++;
            }
            else{
                space+=2;
                times--;
            }
            row++;
            System.out.println();
        }
    }
}
