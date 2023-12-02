package Assignment2;

import java.util.Scanner;

public class ReplaceThemAll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int digit, sum = 0;
        while (num > 0) {
            digit = num % 10;
            if (digit == 0) {
                digit = 5;
            }
            sum = sum * 10 + digit;
            num = num / 10;
        }
        System.out.print(reverseDigit(sum));
    }

    public static int reverseDigit(int num){
        int reverse = 0;
        while (num > 0) {
            reverse = reverse * 10 + num % 10;
            num = num / 10;
        }
        return reverse;
    }
}
