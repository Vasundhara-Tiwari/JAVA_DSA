package Assignment1;

import java.util.Scanner;

public class PatternDoubleSidedArrow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int row = 1;
        int spaceInitial = num-1;
        int spaceMiddle = -1;
        int start = 1;
        int val1 = 1;
        while(row <= num){
            int sp1 = 1;
            while(sp1 <=spaceInitial){
                System.out.print("   ");
                sp1++;
            }
            int j = 1;
            int val = start;
            while(j<=val1){
                System.out.print(val+"  ");
                if(j<=num/2){
                    val--;
                }else{
                    val++;
                }
                j++;
            }
            int sp2 = 1;
            while(sp2 <= spaceMiddle){
                System.out.print("   ");
                sp2++;
            }
            int i = 1;
            if(row == 1 || row == num){
                i=2;
            }
            int value = 1;
            while(i<=val1){
                System.out.print(value+"  ");
                if(i<=num/2){
                    value++;
                }else{
                    value--;
                }
                i++;
            }
            row++;
            System.out.println();
            if(row <= num/2+1){
                start++;
                val1++;
                spaceInitial-=2;
                spaceMiddle+=2;
            }else{
                start--;
                val1--;
                spaceInitial+=2;
                spaceMiddle-=2;
            }
        }
    }
}
