package Assignment2;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int digit = sc.nextInt();
        System.out.println(countDigit(num, digit));
    }
    public static int countDigit(int num, int digit){
        int count = 0;
        while(num > 0) {
            int rem = num%10;
            if(rem == digit){
                count++;
            }
            num/=10;
        }
        return count;
    }
}
